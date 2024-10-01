package org.jhonatan.patrones.decorator2;

import org.jhonatan.patrones.decorator2.decoradores.ConChocolateDecorador;
import org.jhonatan.patrones.decorator2.decoradores.ConCremaDecorador;
import org.jhonatan.patrones.decorator2.decoradores.ConLecheDecorador;

public class EjemploCafeMain {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7, "Cafe Mocha");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe Moca es: " + conChoco.getPrecio());
        System.out.println("los ingredientes son: " + conChoco.getIngredientes());

        Configurable capuchino = new Cafe(4, "Cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("Precio del capuchino: " + conLeche.getPrecio());
        System.out.println("Ingredientes: " + capuchino.getIngredientes());

        Configurable expreso = new Cafe(3, "Cafe Expreso");
        System.out.println("Precio base del cafe expreso : " + expreso.getPrecio());
        System.out.println("Ingredientes del expreso: " + expreso.getIngredientes());
    }
}
