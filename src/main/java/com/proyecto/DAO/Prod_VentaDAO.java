package com.proyecto.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.proyecto.JPA.JPAUtil;
import com.proyecto.modelo.Prod_Venta;

import java.util.ArrayList;
import java.util.List;

public class Prod_VentaDAO {
    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();


    public void guardar(Prod_Venta prod_Venta) {
        entity.getTransaction().begin();
        entity.persist(prod_Venta);
        entity.getTransaction().commit();
    }

    public void editar(Prod_Venta prod_Venta) {
        entity.getTransaction().begin();
        entity.merge(prod_Venta);
        entity.getTransaction().commit();
    }

    public Prod_Venta buscar(int id) {
        Prod_Venta productoVenta;
        productoVenta = entity.find(Prod_Venta.class, id);
        return productoVenta;
    }

    public void eliminar(Prod_Venta prod_Venta) {
        entity.getTransaction().begin();
        entity.remove(prod_Venta);
        entity.getTransaction().commit();
    }
    
    public List<Prod_Venta> obtenerProducVentas() {
        List<Prod_Venta> listaProductos = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Prod_Venta c");
        listaProductos = (List<Prod_Venta>) q.getResultList();
        return listaProductos;
    } 

}
