package org.jhonatan.patrones.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

abstract public class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void preparar() throws InterruptedException {
        /*solo para el ejemplo le damos un retraso de 1 segundo*/
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + salsa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("Agregando Ingredientes ");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();

    abstract public void cortar();

    public void empaquetar() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Poniendo la piza en una caja de empaque.....");
    }

    @Override
    public String toString() {
        return "PizzaProducto{"
                + "nombre=" + nombre
                + ", masa=" + masa
                + ", salsa=" + salsa
                + ", ingredientes="
                + ingredientes + '}';
    }

}
