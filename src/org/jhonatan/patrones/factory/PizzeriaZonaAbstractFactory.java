package org.jhonatan.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo) throws InterruptedException {
        PizzaProducto pizza = crearPiiza(tipo);

        System.out.println("-----Fabricando la pizza " + pizza.getNombre() + " -----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPiiza(String tipo);
}
