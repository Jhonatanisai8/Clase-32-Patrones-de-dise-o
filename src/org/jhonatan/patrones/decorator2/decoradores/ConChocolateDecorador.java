package org.jhonatan.patrones.decorator2.decoradores;

import org.jhonatan.patrones.decorator2.Configurable;

public class ConChocolateDecorador
        extends CafeDecorador {

    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", chocolate";
    }

    @Override
    public float getPrecio() {

        // le sumamamos 5 pesos mas al precio pase
        return cafe.getPrecio() + 5;
    }
}
