package com.proyecto.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

import com.proyecto.JPA.JPAUtil;
import com.proyecto.modelo.Compra;

import net.bytebuddy.agent.builder.AgentBuilder.Default;

import java.util.ArrayList;
import java.util.List;

public class CompraDAO {
    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

    public void guardar(Compra compra) {
        entity.getTransaction().begin();
        entity.persist(compra);
        entity.getTransaction().commit();
    }

    public void editar(Compra compra) {
        entity.getTransaction().begin();
        entity.merge(compra);
        entity.getTransaction().commit();
    }

    public Compra buscar(int id) {
        Compra compra;
        compra = entity.find(Compra.class, id);
        return compra;
    }

    public void eliminar(Compra compra) {
        entity.getTransaction().begin();
        entity.remove(compra);
        entity.getTransaction().commit();
    }

    public List<Compra> obtenerCompras() {
        List<Compra> listaCompras = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Compra c");
        listaCompras = (List<Compra>) q.getResultList();
        return listaCompras;
    }

    public DefaultTableModel tabla() {
        String[] datos = new String[] { "id", "fecha", "total", "Comprador", "Vendedor", "Cantidad" };
        String registros[] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, datos) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                return false;
            }
        };

        List<Compra> compras = obtenerCompras();
        if (compras.size() != 0) {
            for (Compra compra : compras) {
                registros[0] = String.valueOf(compra.getId());
                registros[1] = String.valueOf(compra.getFecha());
                registros[2] = String.valueOf(compra.getTotal());
                registros[3] = compra.getComprador().getNombre();
                registros[4] = compra.getProveedor().getNombre();
                registros[5] = String.valueOf(compra.getProd_Compras().size());
                modelo.addRow(registros);
            }
            return modelo;

        } else {
            modelo = (new javax.swing.table.DefaultTableModel(
                    new Object[][] { { null, null, null, null,null,null } },
                    new String[] { "id", "fecha", "total", "Comprador", "Vendedor", "Cantidad" }));
            return modelo;
        }

    }

}
