package com.proyecto.DAO;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.proyecto.JPA.JPAUtil;
import com.proyecto.modelo.Categoria;
public class CategoriaDAO {
    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

    public void guardar(Categoria categoria) {
        entity.getTransaction().begin();
        entity.persist(categoria);
        entity.getTransaction().commit();
    }

    public void editar(Categoria categoria) {
        entity.getTransaction().begin();
        entity.merge(categoria);
        entity.getTransaction().commit();
    }

    public Categoria buscar(int id) {
        Categoria categoria;
        categoria = entity.find(Categoria.class, id);
        return categoria;
    }

    public void eliminar(Categoria categoria) {
        entity.getTransaction().begin();
        entity.remove(categoria);
        entity.getTransaction().commit();
    }
    public List<Categoria> obtenerCategoria() {
        List<Categoria> llistProveedor = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Categoria c");
        llistProveedor = (List<Categoria>) q.getResultList();
        return llistProveedor;
    }
}
