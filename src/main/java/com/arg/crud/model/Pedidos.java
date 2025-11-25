package com.arg.crud.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pedido;
    private int id_cliente;
    private int id_compra;
    private String direccion;
    private LocalDate fecha_pedido;
    private int id_metodo_envio;
    private int id_estado;

    private int getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_compra() {
        return id_compra;
    }
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha_pedido() {
        return fecha_pedido;
    }
    public void setFecha_pedido(LocalDate fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public int getId_metodo_envio() {
        return id_metodo_envio;
    }
    public void setId_metodo_envio(int id_metodo_envio) {
        this.id_metodo_envio = id_metodo_envio;
    }

    public int getId_estado() {
        return id_estado;
    }
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
}
