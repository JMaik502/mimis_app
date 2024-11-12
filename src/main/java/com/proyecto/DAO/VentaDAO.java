package com.proyecto.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;
import javax.persistence.EntityManager;
import com.proyecto.JPA.JPAUtil;
import com.proyecto.modelo.Venta;

import net.bytebuddy.agent.builder.AgentBuilder.Default;

public class VentaDAO {
    
    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

    public void guardar(Venta venta) {
        entity.getTransaction().begin();
        entity.persist(venta);
        entity.getTransaction().commit();
    }

    public void editar(Venta venta) {
        entity.getTransaction().begin();
        entity.merge(venta);
        entity.getTransaction().commit();
    }

    public Venta buscar(int id) {
        Venta venta;
        venta = entity.find(Venta.class, id);
        return venta;
    }

    public void eliminar(Venta venta) {
        entity.getTransaction().begin();
        entity.remove(venta);
        entity.getTransaction().commit();
    }
    public List<Venta> obtenerVentas() {
        List<Venta> listaVentas = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Venta c");
        listaVentas = (List<Venta>) q.getResultList();
        return listaVentas;
    }

    public DefaultTableModel tabla(){
        String[] datosPresentar = new String[] { "id", "Fecha", "total","nit","nombre","direccion","Vendedor","Productos"};
        String datos[] = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, datosPresentar) {
            @Override
            public boolean isCellEditable(int filas, int columna){
                return false;
            }   
        };
        List<Venta> ventas = obtenerVentas();
        if(ventas.size()!=0){
            for (Venta venta : ventas) {
                datos[0]=String.valueOf(venta.getId());
                datos[1]=String.valueOf(venta.getFecha());
                datos[2]= String.valueOf(venta.getTotal());
                datos[3]=venta.getNit();
                datos[4]=venta.getNombre();
                datos[5]=venta.getDireccion();
                datos[6]=venta.getVendedor().getNombre();
                datos[7]=String.valueOf(venta.getProd_Ventas().size());
                modelo.addRow(datos);
            }
    
            return modelo;
        }else{
            modelo = (new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null,null, null, null, null } },
            new String[] { "id", "Fecha", "total","nit","nombre","direccion","Vendedor","Productos" }));
    return modelo;
        }
        
    }
}
