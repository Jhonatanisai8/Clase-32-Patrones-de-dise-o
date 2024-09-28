/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jhonatan.patrones.factory.producto;

import org.jhonatan.patrones.factory.PizzaProducto;

/**
 *
 * @author User
 */
public class PizzaNewYorkVegetariana
        extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Maza integral vegana";
        ingredientes.add("Queso Vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Espinacas");
        ingredientes.add("Aceitunas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 a 150º C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }

}
