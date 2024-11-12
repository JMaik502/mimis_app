package com.proyecto.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.swing.table.DefaultTableModel;

@Entity(name = "Venta")
@Table(name = "Venta")
public class Venta {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, updatable = false)
    private Date fecha = new Date();
    @Column
    private int total;
    @Column
    private String nit;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "f_Usuario")
    private Usuario Vendedor;
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
	private List<Prod_Venta> prod_Ventas = new ArrayList<>();
	

    public Venta(Venta venta){
        this.id = venta.getId();
        this.total = venta.getTotal();
        this.nombre = venta.getNombre();
        this.Vendedor=venta.getVendedor();
        this.nit=venta.getNit();
        this.direccion = venta.getDireccion();
        this.fecha=venta.getFecha();
    }
    public Venta(){}
    public Venta(int total, String nit, String nombre, String direccion, Usuario vendedor){
        this.direccion=direccion;
        this.total=total;
        this.nit = nit;
        this.nombre = nombre;
        this.Vendedor = vendedor;
    }
    public Venta( String nit, String nombre, String direccion, Usuario vendedor){
        this.direccion=direccion;
        this.nit = nit;
        this.nombre = nombre;
        this.Vendedor = vendedor;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public List<Prod_Venta> getProd_Ventas() {
        return prod_Ventas;
    }
    public Date getFecha() {
        return fecha;
    }
    public int getId() {
        return id;
    }public String getNit() {
        return nit;
    }public String getNombre() {
        return nombre;
    }public int getTotal() {
        return total;
    }
    public Usuario getVendedor() {
        return Vendedor;
    }



    
    public DefaultTableModel tablaProdCompra(List<Prod_Venta> lista) {
        String[] datosPresentar = new String[] { "Producto", "Cantidad", "total" };
        String datos[] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null, datosPresentar) {
            @Override
            public boolean isCellEditable(int filas, int columna) {
                return false;
            }
        };
        for (Prod_Venta prod_Venta : lista) {
            datos[0] = prod_Venta.getProducto().getNombre();
            datos[1] = String.valueOf(prod_Venta.getCantidad());
            datos[2] = String.valueOf(prod_Venta.getTotal());
            modelo.addRow(datos);
        }

        return modelo;
    }
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", total='" + getTotal() + "'" +
            ", nit='" + getNit() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", Vendedor='" + getVendedor() + "'" +
            "}";
    }

}
