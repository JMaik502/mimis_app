package com.proyecto.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name = "Proveedor")
@Table(name = "Proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private int numTelefono;
    @Column
    private String direccion;
    @Column
    private String nit;
    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL)
    List<Compra> compras = new ArrayList<>();
    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL)
    private List<Product_Proved> product_Proveds = new ArrayList<>();

    public Proveedor() {
    }

    public Proveedor( String nombre, String direccion, int numTelefono, String nit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
        this.nit = nit;
    }

    public int getId() {
        return id;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public List<Product_Proved> getProduct_Proveds() {
        return product_Proveds;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getNit() {
        return nit;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", numTelefono='" + getNumTelefono()
                + "'" + ", direccion='" + getDireccion() + "'" + ", compras='" + getCompras().size() + "'"
                + ", product_Proveds='" + getProduct_Proveds().size() + "'" + "}";
    }

}