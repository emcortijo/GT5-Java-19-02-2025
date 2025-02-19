package com.example.GestionProductos.model;

import java.util.Random;

public class Producto {
    private int ID;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        Random r = new Random();
        this.ID = r.nextInt();
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {}

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
