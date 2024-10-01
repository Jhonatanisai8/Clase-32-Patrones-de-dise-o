package org.jhonatan.patrones.decorator2.decoradores;

import org.jhonatan.patrones.decorator2.Configurable;

abstract public class CafeDecorador
        implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }

}
