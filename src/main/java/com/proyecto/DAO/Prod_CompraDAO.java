package com.proyecto.DAO;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.proyecto.JPA.JPAUtil;
import com.proyecto.modelo.Prod_Compra;

import java.util.ArrayList;
import java.util.List;
public class Prod_CompraDAO {
    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

    public void guardar(Prod_Compra compraP) {
        entity.getTransaction().begin();
        entity.persist(compraP);
        entity.getTransaction().commit();
    }

    public void editar(Prod_Compra compraP) {
        entity.getTransaction().begin();
        entity.merge(compraP);
        entity.getTransaction().commit();
    }

    public Prod_Compra buscar(int id) {
        Prod_Compra productoC;
        productoC = entity.find(Prod_Compra.class, id);
        return productoC;
    }

    public void eliminar(Prod_Compra compraP) {
        entity.getTransaction().begin();
        entity.remove(compraP);
        entity.getTransaction().commit();
    }
    
    public List<Prod_Compra> obtenerProductoCompra() {
        List<Prod_Compra> listaProductos = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Prod_Compra c");
        listaProductos = (List<Prod_Compra>) q.getResultList();
        return listaProductos;
    }

}
