package com.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Prod_Venta")
public class Prod_Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto producto;
   
    @ManyToOne
    @JoinColumn(name = "ventaId")
    private Venta venta;

    @Column
    private int total;

    @Column
    private int cantidad;

    public Prod_Venta(){}
    public Prod_Venta(Producto producto, Venta venta, int total, int cantidad) {
       
        this.producto = producto;
        this.venta = venta;
        this.total = total;
        this.cantidad = cantidad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return this.venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", producto='" + getProducto().getId()+ "'" +
            ", venta='" + getVenta().getId() + "'" +
            ", total='" + getTotal() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            "}";
    }






}
