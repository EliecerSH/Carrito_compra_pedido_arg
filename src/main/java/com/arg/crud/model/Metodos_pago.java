package com.arg.crud.model;
import jakarta.persistence.*;


@Entity
public class Metodos_pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_metodo_pago;
    private String nombre_metodo;
    private String descripcion;

    public int getId_metodo_pago() {
        return id_metodo_pago;
    }
    public void setId_metodo_pago(int id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

    public String getNombre_metodo_pago() {
        return nombre_metodo;
    }
    public void setNombre_metodo_pago(String nombre_metodo_pago) {
        this.nombre_metodo = nombre_metodo_pago;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
