package com.proyecto.DAO;

import com.proyecto.modelo.Categoria;
import com.proyecto.modelo.Product_Proved;
import com.proyecto.modelo.Producto;
import com.proyecto.modelo.Proveedor;

import org.hibernate.hql.internal.ast.tree.IsNotNullLogicOperatorNode;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

import com.proyecto.JPA.JPAUtil;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

    public void guardar(Producto producto) {
        entity.getTransaction().begin();
        entity.persist(producto);
        entity.getTransaction().commit();
    }

    public void editar(Producto producto) {
        entity.getTransaction().begin();
        entity.merge(producto);
        entity.getTransaction().commit();
    }

    public Producto buscar(int id) {
        Producto producto;
        producto = entity.find(Producto.class, id);
        return producto;
    }

    public void eliminar(Producto producto) {
        entity.getTransaction().begin();
        entity.remove(producto);
        entity.getTransaction().commit();
    }

    public List<Producto> obtenerProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        Query q = entity.createQuery("SELECT c FROM Producto c");
        listaProductos = (List<Producto>) q.getResultList();
        return listaProductos;
    }

    public DefaultTableModel tabla() {
        String[] datos = new String[] { "id", "Nombre", "Precio", "Existencias" };
        String registros[] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, datos) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                return false;
            }
        };

        List<Producto> productos = obtenerProductos();
        if (productos.size() != 0) {
            for (Producto prodcuto : productos) {
                registros[0] = String.valueOf(prodcuto.getId());
                registros[1] = String.valueOf(prodcuto.getNombre());
                registros[2] = String.valueOf(prodcuto.getPrecio());
                registros[3] = String.valueOf(prodcuto.getCantidad());

                modelo.addRow(registros);
            }
            return modelo;

        } else {
            modelo = (new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null },
                    { null, null, null, null }, { null, null, null, null }, { null, null, null, null } },
                    new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
            return modelo;
        }

    }

    public DefaultTableModel tabla(Categoria categoria) {
        String[] datos = new String[] { "id", "Nombre", "Precio", "Existencias" };
        String registros[] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, datos) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                return false;
            }
        };

        List<Producto> productos = categoria.getProductos();
        if (productos.size() != 0) {
            for (Producto prodcuto : productos) {
                registros[0] = String.valueOf(prodcuto.getId());
                registros[1] = String.valueOf(prodcuto.getNombre());
                registros[2] = String.valueOf(prodcuto.getPrecio());
                registros[3] = String.valueOf(prodcuto.getCantidad());

                modelo.addRow(registros);
            }
            return modelo;
        } else {
            for (Producto prodcuto : productos) {
                registros[0] = String.valueOf(prodcuto.getId());
                registros[1] = String.valueOf(prodcuto.getNombre());
                registros[2] = String.valueOf(prodcuto.getPrecio());
                registros[3] = String.valueOf(prodcuto.getCantidad());

                modelo.addRow(registros);
            }
            return modelo;
        }

    }

    public DefaultTableModel tabla(Proveedor proveedor) {
        String[] datos = new String[] { "id", "Nombre", "Precio", "Existencias" };
        String registros[] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, datos) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                return false;
            }
        };

        

        if (proveedor.getProduct_Proveds().size() != 0) {

            List<Product_Proved> product_Proveds = proveedor.getProduct_Proveds();
            List<Producto> productos = new ArrayList<>();
            for (Product_Proved product_Proved : product_Proveds) {
                if (product_Proved.getProducto() != null) {
                    Producto producto = new Producto();
                    producto = product_Proved.getProducto();
                    productos.add(producto);
                }
            }
            if (productos.size() != 0) {
            for (Producto prodcuto : productos) {
                registros[0] = String.valueOf(prodcuto.getId());
                registros[1] = String.valueOf(prodcuto.getNombre());
                registros[2] = String.valueOf(prodcuto.getPrecio());
                registros[3] = String.valueOf(prodcuto.getCantidad());

                modelo.addRow(registros);
            }
            return modelo;
        }else{
            modelo = (new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null },
                    { null, null, null, null }, { null, null, null, null }, { null, null, null, null } },
                    new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
            return modelo;
        }   
        } else {
            modelo = (new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null },
            { null, null, null, null }, { null, null, null, null }, { null, null, null, null } },
            new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
    return modelo;
    }
    }

    public DefaultTableModel tabla(Proveedor proveedor, Categoria categoria) {
        String[] datos = new String[] { "id", "Nombre", "Precio", "Existencias" };
        String registros[] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, datos) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                return false;
            }
        };
        
        if (proveedor.getProduct_Proveds().size() != 0) {

            List<Product_Proved> product_Proveds = proveedor.getProduct_Proveds();
            List<Producto> productosProveedor = new ArrayList<>();
            List<Producto> productos = new ArrayList<>();

            for (Product_Proved product_Proved : product_Proveds) {
                if (product_Proved.getProducto() != null) {
                    Producto producto = new Producto();
                    producto = product_Proved.getProducto();
                    productosProveedor.add(producto);
                }
                if (categoria.getProductos().size() != 0) {
                    List<Producto> productosCategoria = new ArrayList<>();
                    productosCategoria = categoria.getProductos();
                    for (Producto producto : productosProveedor) {
                        for (Producto producto1 : productosCategoria) {
                            if (producto.equals(producto1)) {
                                productos.add(producto);
                            }
                        }
                    }

                    for (Producto prodcuto : productos) {
                        registros[0] = String.valueOf(prodcuto.getId());
                        registros[1] = String.valueOf(prodcuto.getNombre());
                        registros[2] = String.valueOf(prodcuto.getPrecio());
                        registros[3] = String.valueOf(prodcuto.getCantidad());

                        modelo.addRow(registros);
                    }
                    return modelo;

                }

            }

        } else {
            modelo = (new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null },
                    { null, null, null, null }, { null, null, null, null }, { null, null, null, null } },
                    new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
            return modelo;
        }

        return modelo;

    }
}
