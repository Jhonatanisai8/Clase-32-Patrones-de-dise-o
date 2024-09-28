package org.jhonatan.patrones.factory;

public class PizzaNewYorkItaliana
        extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa.";
        salsa = "Salsa de tomate italiano carne";
        ingredientes.add("Queso mozarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Chorilloso");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120ºC.");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes.");
    }

}
