package com.integrattion.mbpi.integratorecommerce.model;

public class Dashboard {
    private Identidad identidad;
    private Menu menu;
    private Producto producto;
    private User usuario;

    public Identidad getIdentidad() {
        return identidad;
    }

    public void setIdentidad(Identidad identidad) {
        this.identidad = identidad;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

}
