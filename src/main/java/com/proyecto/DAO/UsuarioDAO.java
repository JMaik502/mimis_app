package com.proyecto.DAO;

import com.proyecto.modelo.Usuario;

import net.bytebuddy.agent.builder.AgentBuilder.Default;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

import com.proyecto.JPA.JPAUtil;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

    public void guardar(Usuario usuario) {
        entity.getTransaction().begin();
        entity.persist(usuario);
        entity.getTransaction().commit();
    }

    public void editar(Usuario usuario) {
        entity.getTransaction().begin();
        entity.merge(usuario);
        entity.getTransaction().commit();
    }

    public Usuario buscar(int id) {
        Usuario usuario;
        usuario = entity.find(Usuario.class, id);
        return usuario;
    }

    public void eliminar(Usuario usuario) {
        entity.getTransaction().begin();
        entity.remove(usuario);
        entity.getTransaction().commit();
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Usuario c");
        listaUsuarios = (List<Usuario>) q.getResultList();
        return listaUsuarios;
    }

    public Usuario buscar(String user, String contra) {
        // "Select * From Usuario where nombre adn contrasena values(?,?)"

        Query q = // entity.createQuery("Select id From Usuario where nombre and contrasena
                  // values(?,?)").setParameter(1, user).setParameter(2, contra);
                entity.createQuery(
                        "SELECT id FROM Usuario WHERE nombre='" + user + "' AND contrasena='" + contra + "'");
        Usuario usuario = // (Usuario) q.getSingleResult();
                buscar((int) q.getSingleResult());
        return usuario;

    }

    public DefaultTableModel tabla() {
        String[] datosPresentar = new String[] { "id", "nombre", "correo" };
        String datos[] = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, datosPresentar) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                if (columna == 1) {
                    return true;
                } if(columna == 2){
                    return true;
                }if(columna == 3){
                    return true;
                }else{
                    return false;
                }

                }
            
        };
        List<Usuario> usuarios = obtenerUsuarios();
        if (usuarios.size() != 0) {
            for (Usuario usuario : usuarios) {
                datos[0] = String.valueOf(usuario.getId());
                datos[1] = usuario.getNombre();
                datos[2] = usuario.getCorreo();
                modelo.addRow(datos);
            }

        } else {
            System.out.println("Sin datos");
        }

        return modelo;

    }
}
