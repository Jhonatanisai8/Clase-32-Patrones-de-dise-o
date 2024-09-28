/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jhonatan.patrones.factory;

import org.jhonatan.patrones.factory.producto.PizzaNewYorkVegetariana;

/**
 *
 * @author User
 */
public class FabricaNewYork
        extends
        PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPiiza(String tipo) {
        PizzaProducto pizzaProducto = null;

        //segun el tipo se crea una instancia
        switch (tipo) {
            case "vegetariana":
                pizzaProducto = new PizzaNewYorkVegetariana();
                break;
            case "peperoni":
                pizzaProducto = new PizzaNewYorkPeperoni();
                break;
            case "italiana":
                pizzaProducto = new PizzaNewYorkItaliana();
                break;
        }
        return pizzaProducto;
    }

}
