package com.integrattion.mbpi.integratorecommerce.model;

public class Producto {
    private Integer id;
    private String tipo;
    private String descripcion;
    private Double precio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Producto(Integer id, String tipo, String descripcion, Double precio) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

}
