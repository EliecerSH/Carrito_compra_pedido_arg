package com.arg.crud.model;
import jakarta.persistence.*;


@Entity
public class Metodos_envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_metodo_envio;
    private String nombre_metodo;
    private String descricion;
    private float costo;

    private int getId_metodo_envio() {
        return id_metodo_envio;
    }
    public void setId_metodo_envio(int id_metodo_envio) {
        this.id_metodo_envio = id_metodo_envio;
    }

    public String getNombre_metodo() {
        return nombre_metodo;
    }
    public void setNombre_metodo(String nombre_metodo) {
        this.nombre_metodo = nombre_metodo;
    }

    public String getDescricion() {
        return descricion;
    }
    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
}
