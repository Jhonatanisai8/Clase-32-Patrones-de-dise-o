package org.jhonatan.patrones.decorator2.decoradores;

import org.jhonatan.patrones.decorator2.Configurable;

public class ConLecheDecorador
        extends CafeDecorador {

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio() + 3.7f;

    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", leche.";
    }

}
