package com.proyecto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import com.proyecto.DAO.*;
import com.proyecto.interfaces2.Login;
import com.proyecto.modelo.*;

import org.jboss.jandex.TypeTarget.Usage;
import org.junit.Test;

public class appTest {
    /*
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    CompraDAO compraDAO = new CompraDAO();
    ProductoDAO productoDAO = new ProductoDAO();
    Prod_CompraDAO prod_CompraDAO = new Prod_CompraDAO();
    Prod_VentaDAO prod_VentaDAO = new Prod_VentaDAO();
    VentaDAO ventaDAO = new VentaDAO();
    Product_ProvedDAO product_ProvedDAO = new Product_ProvedDAO();
    CategoriaDAO categoriaDAO = new CategoriaDAO();


    @Test
    public void buscaruser(){
        Usuario user = usuarioDAO.buscar("Juan", "1234");
        System.out.println(user.toString());
        assertNotNull(user);
    }
    @Test
    public void actualizarUsuario(){
        Usuario usuario;
        usuario = usuarioDAO.buscar(2);
        usuario.setAdmin(true);
        usuarioDAO.editar(usuario);
    }
    @Test
    public void meterUsuario() {
        String nombre, contra;
        nombre= "pablo";
        contra="1234";
        Usuario user = new Usuario(nombre, contra, "jujoo52@gmai.com", true);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.guardar(user);
        assertNotNull(usuarioDAO.buscar(nombre, contra));
    }

    @Test
    public void addCategorias() {
        categoriaDAO.guardar(new Categoria("Carnes", 1));
        categoriaDAO.guardar(new Categoria("Verduras", 2));

    }

    @Test
    public void insertarProducto() {
        Categoria categoria = categoriaDAO.buscar(1);
        Categoria categoria1 = categoriaDAO.buscar(2);
        Producto producto = new Producto("Papa", 20, 200, 1, categoria1);
        Producto producto1 = new Producto("pollo", 10, 50, 2, categoria);
        productoDAO.guardar(producto);
        productoDAO.guardar(producto1);

    }

    @Test
    public void buscarUsuario() {

        Usuario user = usuarioDAO.buscar(1);
        System.out.println(user.getNombre() + " y contra: " + user.getContrasena());
        assertNotNull(user);
    }

    @Test
    public void subirProveedor() {
        Proveedor proveedor = new Proveedor( "Los lobos", "Panajachel", 1565478, "15246211-6");
        Proveedor proveedor1 = new Proveedor( "Los Pollos", "Panajachel", 54565478, "58465-8");
        proveedorDAO.guardar(proveedor);
        proveedorDAO.guardar(proveedor1);
        Producto producto1 = productoDAO.buscar(2);
        Producto producto = productoDAO.buscar(1);
        agregarProductProveedor(producto, proveedor);
        agregarProductProveedor(producto1, proveedor1);
        assertNotNull(proveedorDAO.buscar(1));
    }
    @Test 
    public void borrarProveedor(){

        proveedorDAO.eliminar(proveedorDAO.buscar(12));
        proveedorDAO.eliminar(proveedorDAO.buscar(11));

    }
    @Test
    public void agregarProdaProveedor() {
        Proveedor proveedor = proveedorDAO.buscar(12);
        Categoria categoria = categoriaDAO.buscar(1);
        productoDAO.guardar(new Producto("Carne", 25, 50, 3, categoria));
        productoDAO.guardar(new Producto("Cerdo", 15, 75, 4, categoria));
        Producto producto1 = productoDAO.buscar(3);
        Producto producto = productoDAO.buscar(4);
        agregarProductProveedor(producto, proveedor);
        agregarProductProveedor(producto1, proveedor);

    }

    public void agregarProductProveedor(Producto producto, Proveedor proveedor) {
        product_ProvedDAO.guardar(new Product_Proved(producto, proveedor));
    }

    @Test
    public void buscarProveedorProduc() {

        Proveedor proveedor = proveedorDAO.buscar(12);
        List<Product_Proved> product_Proveds = proveedor.getProduct_Proveds();
        for (Product_Proved product_Proved : product_Proveds) {
            Producto prod = product_Proved.getProducto();
            System.out.println(prod.toString());
        }
        assertNotNull(proveedor);
    }

    @Test
    public void addCompra() {
        Proveedor proveedor = proveedorDAO.buscar(11);
        Usuario user = usuarioDAO.buscar(1);
        Compra compra = new Compra(500, user, proveedor);
        compraDAO.guardar(compra);
        compra.setId(buscarUltimaIdCompra());
        Producto producto1 = productoDAO.buscar(2);
        Producto producto = productoDAO.buscar(1);
        agregarProductCompra(5, 250, producto1, compra);
        agregarProductCompra(2, 250, producto, compra);
    }

    @Test
    public void addCompraProduct() {

        Compra compra = compraDAO.buscar(1);
        Producto producto1 = productoDAO.buscar(2);
        Producto producto = productoDAO.buscar(1);
        agregarProductCompra(5, 250, producto1, compra);
        agregarProductCompra(2, 250, producto, compra);
    }

    @Test
    public void showComprPro() {
        Proveedor proveedor = proveedorDAO.buscar(11);

        List<Compra> compras = proveedor.getCompras();

        if (compras.size() != 0) {
            for (Compra compra : compras) {
                List<Prod_Compra> compras1 = compra.getProd_Compras();
                // System.out.println("Compra\n" + compra.toString());
                for (Prod_Compra compra2 : compras1) {
                    System.out.println("Producto\n" + compra2.getProducto().toString());
                    
                }
            }

        } else {
            System.out.println("No funciona");
        }
    }

    @Test
    public void showUsuaCompr() {
        Usuario user = usuarioDAO.buscar(1);

        List<Compra> compras = user.getCompras();

        if (compras.size() != 0) {
            for (int i = 0; compras.size() > i; i++) {
                System.out.println(compras.get(i).toString());
            }

        } else {
            System.out.println("No funciona");
        }
    }

    public void agregarProductCompra(int cantidad, int total, Producto producto, Compra compra) {
        Prod_Compra compraP = new Prod_Compra(cantidad, total, producto, compra);
        prod_CompraDAO.guardar(compraP);
    }

    @Test
    public void comprashow() {
        Prod_Compra compraP = prod_CompraDAO.buscar(1);
        Compra compra = compraP.getCompra();
        System.out.println(compra.getComprador().getCompras().size());
        for (Compra compra2 : compra.getComprador().getCompras()) {
            System.out.println(compra2);
        }
    }

    @Test
    public void agregarVenta() {
        Usuario vendedor = usuarioDAO.buscar(1);
        Venta venta = new Venta("120512", "Juan", "Panajachel", vendedor);
        ventaDAO.guardar(venta);
        System.out.println(buscarUltimaIdVenta());
        venta.setId(buscarUltimaIdVenta());
        Producto producto1 = productoDAO.buscar(2);
        Producto producto = productoDAO.buscar(1);
        agregarProductVenta(venta, producto, 10, 1000);
        agregarProductVenta(venta, producto1, 152, 859);
    }

    @Test
    public void verVenta() {
        Venta venta = ventaDAO.buscar(buscarUltimaIdVenta());
        List<Prod_Venta> prod_Ventas = venta.getProd_Ventas();
        for (Prod_Venta prod_Venta : prod_Ventas) {
            System.out.println(prod_Venta.toString());

        }
    }

    public void agregarProductVenta(Venta venta, Producto producto, int cantidad, int total) {
        prod_VentaDAO.guardar(new Prod_Venta(producto, venta, total, cantidad));
    }

    public int buscarUltimaIdCompra() {
        int id = 0, t;
        t = compraDAO.obtenerCompras().size();
        for (int i = 0; i < t; i++) {
            if (i == t - 1) {
                System.out.println(i);
                id = i;
            }
        }

        return id;
    }

    public int buscarUltimaIdVenta() {
        int id = 0, t;
        t = ventaDAO.obtenerVentas().size();
        for (int i = 0; i < t; i++) {
            if (i == t - 1) {
                id = i;
            }
        }

        return id;
    }
    */

}
