package com.proyecto.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.swing.table.DefaultTableModel;

@Table(name = "Compra")
@Entity(name = "Compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, updatable = false)
    private Date fecha;

    @Column
    private int total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "f_Usuario")
    private Usuario comprador;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "f_Proveedor")
    private Proveedor proveedor;
    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private List<Prod_Compra> prod_Compras = new ArrayList<>();

    public Compra(int total, Usuario comprador, Proveedor proveedor) {
        this.comprador = comprador;
        this.total = total;
        this.proveedor = proveedor;
        this.fecha = new Date();
    }

    public Compra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Prod_Compra> getProd_Compras() {
        return prod_Compras;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public int getTotal() {
        return total;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public DefaultTableModel tablaProdCompra(List<Prod_Compra> lista) {
        String[] datosPresentar = new String[] { "Producto", "Cantidad", "total" };
        String datos[] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null, datosPresentar) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                return false;
            }
        };
        for (Prod_Compra prod_Compra : lista) {
            datos[0] = prod_Compra.getProducto().getNombre();
            datos[1] = String.valueOf(prod_Compra.getCantidad());
            datos[2] = String.valueOf(prod_Compra.getTotal());
            modelo.addRow(datos);
        }

        return modelo;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", fecha='" + getFecha() + "'" + ", total='" + getTotal() + "'"
                + ", comprador='" + comprador.getId() + "'" + ", proveedor='" + proveedor.getId() + "'" + "}";
    }

}