package org.jhonatan.patrones.decorator2;

public class Cafe
        implements Configurable {
    private float recio;
    private String nombre;

    public Cafe(float recio, String nombre) {
        this.recio = recio;
        this.nombre = nombre;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }

    @Override
    public float getPrecio() {
        return this.recio;
    }
}
