package org.jhonatan.patrones.decorator2.decoradores;

import org.jhonatan.patrones.decorator2.Configurable;

public class ConCremaDecorador
        extends CafeDecorador {

    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", crema.";
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio() + 2.5f;
    }
}
