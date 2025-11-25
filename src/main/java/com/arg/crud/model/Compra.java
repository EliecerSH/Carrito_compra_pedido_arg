package com.arg.crud.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compra;
    private int id_carrito;
    private int cliente;
    private String direccion_envio;
    private int id_metodo_pago;
    private int id_metodo_envio;
    private LocalDate fecha_compra;
    private Float total;

    private int getId_compra() {
        return id_compra;
    }
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_carrito() {
        return id_carrito;
    }
    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getCliente() {
        return cliente;
    }
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }
    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public int getId_metodo_pago() {
        return id_metodo_pago;
    }
    public void setId_metodo_pago(int id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

    public int getId_metodo_envio() {
        return id_metodo_envio;
    }
    public void setId_metodo_envio(int id_metodo_envio) {
        this.id_metodo_envio = id_metodo_envio;
    }

    public LocalDate getFecha_compra() {
        return fecha_compra;
    }
    public void setFecha_compra(LocalDate fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }

}
