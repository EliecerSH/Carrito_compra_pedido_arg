package com.arg.crud.model;
import jakarta.persistence.*;


@Entity
public class Detalle_pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalle;
    private int id_pedido;
    private int id_produto;
    private int cantidad;
    private float precio_unitario;
    private float subtotal;

    public int getId_detalle() {
        return id_detalle;
    }
    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_produto() {
        return id_produto;
    }
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }
    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

}
