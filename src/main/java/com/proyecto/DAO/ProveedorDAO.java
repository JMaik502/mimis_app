package com.proyecto.DAO;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

import com.proyecto.JPA.JPAUtil;
import com.proyecto.modelo.Proveedor;

import java.util.ArrayList;
import java.util.List;
public class ProveedorDAO {
    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

    public void guardar(Proveedor proveedor) {
        entity.getTransaction().begin();
        entity.persist(proveedor);
        entity.getTransaction().commit();
    }

    public void editar(Proveedor proveedor) {
        entity.getTransaction().begin();
        entity.merge(proveedor);
        entity.getTransaction().commit();
    }

    public Proveedor buscar(int id) {
        Proveedor proveedor;
        proveedor = entity.find(Proveedor.class, id);
        return proveedor;
    }

    public void eliminar(Proveedor proveedor) {
        entity.getTransaction().begin();
        entity.remove(proveedor);
        entity.getTransaction().commit();
    }
    public List<Proveedor> obtenerProveedor() {
        List<Proveedor> llistProveedor = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Proveedor c");
        llistProveedor = (List<Proveedor>) q.getResultList();
        return llistProveedor;
    }
    public DefaultTableModel tabla(){
        String[] datosPresentar = new String[] { "id","Nombre","NIT", "Num Telefono", "Dirrecion","Compras","Productos"};
        String datos[] = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, datosPresentar) {
            @Override
            public boolean isCellEditable(int filas, int columna){
                return false;
            }   
        };
        List<Proveedor> proveedors = obtenerProveedor();
        if(proveedors.size()!=0){
            for (Proveedor proveedor : proveedors) {
                datos[0]=String.valueOf(proveedor.getId());
                datos[1]=String.valueOf(proveedor.getNombre());
                datos[2]=String.valueOf(proveedor.getNit());
                datos[3]=String.valueOf(proveedor.getNumTelefono());
                datos[4]= String.valueOf(proveedor.getDireccion());
                datos[5]=String.valueOf(proveedor.getCompras().size());
                datos[6]=String.valueOf(proveedor.getProduct_Proveds().size());
                modelo.addRow(datos);
            }
    
            return modelo;
        }else{
            modelo = (new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            return modelo;
        }
      
    }
}
