package com.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prod_Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto producto;
   
    @ManyToOne
    @JoinColumn(name = "compraId")
    private Compra compra;

    @Column
    private int cantidad;
    @Column
    private int total;

    public Prod_Compra() {
    }

    public Prod_Compra(int cantidad, int total, Producto producto, Compra compra) {

        this.cantidad = cantidad;
        this.compra = compra;
        this.total = total;
        this.producto = producto;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setCompra(Compra compra) {
        this.compra = compra;
    }public void setTotal(int total) {
        this.total = total;
    }
    public int getCantidad() {
        return cantidad;
    }public Compra getCompra() {
        return compra;
    }public int getId() {
        return id;
    }public Producto getProducto() {
        return producto;
    }public int getTotal() {
        return total;
    }
}
