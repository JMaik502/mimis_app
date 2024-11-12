package com.proyecto.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Proved")
public class Product_Proved {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    
    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto producto;
   
    @ManyToOne
    @JoinColumn(name = "proveedorId")
    private Proveedor proveedor;

    public Product_Proved() {
    }



    public Product_Proved( Producto producto, Proveedor proveedor) {
        this.producto = producto;
        this.proveedor = proveedor;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setId(int id) {
        this.id = id;
    }public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }public int getId() {
        return id;
    }public Producto getProducto() {
        return producto;
    }public Proveedor getProveedor() {
        return proveedor;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", producto='" + getProducto().getId() + "'" +
            ", proveedor='" + getProveedor().getId() + "'" +
            "}";
    }



}
