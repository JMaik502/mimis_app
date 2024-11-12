package com.proyecto.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Producto")
@Table(name = "Producto")
public class Producto {

	@Id
	private int id;
	@Column
	private String nombre;
	@Column
	private double precio;
	@Column
	private double cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "f_Categoria")
	private Categoria categoria;

	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private List<Prod_Compra> prod_Compras = new ArrayList<>();

	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private List<Prod_Venta> prod_Ventas = new ArrayList<>();

	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private List<Product_Proved> product_Proveds = new ArrayList<>();

	public Producto() {
	}

	public Producto(String nombre, double precio, double cantidad, int id, Categoria categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.id = id;
		this.categoria = categoria;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public List<Prod_Compra> getProd_Compras() {
		return prod_Compras;
	}

	public List<Prod_Venta> getProd_Ventas() {
		return prod_Ventas;
	}

	public List<Product_Proved> getProduct_Proveds() {
		return product_Proveds;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Producto)) {
			return false;
		}
		Producto producto = (Producto) o;
		return id == producto.id && Objects.equals(nombre, producto.nombre) && precio == producto.precio && cantidad == producto.cantidad && Objects.equals(categoria, producto.categoria) && Objects.equals(prod_Compras, producto.prod_Compras) && Objects.equals(prod_Ventas, producto.prod_Ventas) && Objects.equals(product_Proveds, producto.product_Proveds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, precio, cantidad, categoria, prod_Compras, prod_Ventas, product_Proveds);
	}


	@Override
	public String toString() {
		return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", precio='" + getPrecio() + "'"
				+ ", cantidad='" + getCantidad() + "'" + ", categoria='" + getCategoria().getId() + "'"
				+ ", prod_Compras='" + getProd_Compras().size() + "'" + ", prod_Ventas='" + getProd_Ventas().size()
				+ "'" + ", product_Proveds='" + getProduct_Proveds().size() + "'" + "}";
	}

}
