package com.proyecto.modelo;

import javax.persistence.Entity;
import java.util.*;

import javax.persistence.*;

@Entity(name = "Usuario")
@Table(name = "Usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String contrasena;
    @Column
    private boolean admin;
    @Column
    private String correo;
    @OneToMany(mappedBy = "comprador", cascade = CascadeType.ALL) 
    List<Compra> compras = new ArrayList<>();
    @OneToMany(mappedBy = "Vendedor", cascade = CascadeType.ALL) 
    List<Venta> ventas = new ArrayList<>(); 

    public Usuario(){}
    public Usuario(String nombre, String contrasena, String correo, boolean admin){
        this.admin=admin;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.correo = correo;
    }
    public List<Compra> getCompras() {
        return compras;
    }
    public String getCorreo() {
        return correo;
    }public List<Venta> getVentas() {
        return ventas;
    }
    public int getId() {
        return id;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public boolean getAdmin() {
        return admin;
    }
    public String getContrasena() {
        return contrasena;
    }public String getNombre() {
        return nombre;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", contrasena='" + getContrasena() + "'" +
            ", admin='" + admin + "'" +
            ", correo='" + getCorreo() + "'" +
            ", compras='" + "Compras" + "'" +
            ", ventas='" + "ventas"+ "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nombre, usuario.nombre) && Objects.equals(contrasena, usuario.contrasena) && admin == usuario.admin && Objects.equals(correo, usuario.correo) && Objects.equals(compras, usuario.compras) && Objects.equals(ventas, usuario.ventas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, contrasena, admin, correo, compras, ventas);
    }

    
}
