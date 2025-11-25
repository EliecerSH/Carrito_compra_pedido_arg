package com.arg.crud.model;
import jakarta.persistence.*;


@Entity
public class Carrito_detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalle;
    private int id_carrito;
    private int id_producto;
    private int cantidad;

    private int getId_detalle() {
        return id_detalle;
    }
    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getId_carrito() {
        return id_carrito;
    }
    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getId_producto() {
        return id_producto;
    }
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
