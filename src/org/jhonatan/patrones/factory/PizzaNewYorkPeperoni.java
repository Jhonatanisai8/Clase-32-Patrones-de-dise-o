package org.jhonatan.patrones.factory;

public class PizzaNewYorkPeperoni
        extends PizzaProducto {

    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza Peperoni New York";
        masa = "Masa delgada y a piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozarella");
        ingredientes.add(" Extra peperoni");
        ingredientes.add("Aceituna");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos.");
    }

}
