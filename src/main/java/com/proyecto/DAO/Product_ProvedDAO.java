package com.proyecto.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.proyecto.JPA.JPAUtil;
import com.proyecto.modelo.Product_Proved;

public class Product_ProvedDAO {
    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();


    public void guardar(Product_Proved produnc_Proved) {
        entity.getTransaction().begin();
        entity.persist(produnc_Proved);
        entity.getTransaction().commit();
    }

    public void editar(Product_Proved produnc_Proved) {
        entity.getTransaction().begin();
        entity.merge(produnc_Proved);
        entity.getTransaction().commit();
    }

    public Product_Proved buscar(int id) {
        Product_Proved productoVenta;
        productoVenta = entity.find(Product_Proved.class, id);
        return productoVenta;
    }

    public void eliminar(Product_Proved produnc_Proved) {
        entity.getTransaction().begin();
        entity.remove(produnc_Proved);
        entity.getTransaction().commit();
    }
    
    public List<Product_Proved> obtenerProducProved() {
        List<Product_Proved> listaProductos = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Product_Proved c");
        listaProductos = (List<Product_Proved>) q.getResultList();
        return listaProductos;
    } 
}
