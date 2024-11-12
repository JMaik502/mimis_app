package com.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    private int id;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    List<Producto> productos = new ArrayList<>();
    @Column
    private String nombre;

    public Categoria() {
    }

    public Categoria(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setId(int id) {
        this.id = id;
    }
}
