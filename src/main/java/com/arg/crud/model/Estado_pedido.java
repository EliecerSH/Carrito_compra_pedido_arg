package com.arg.crud.model;
import jakarta.persistence.*;


@Entity
public class Estado_pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estado;
    private String descripcion;

    public int getId_estado() {
        return id_estado;
    }
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
