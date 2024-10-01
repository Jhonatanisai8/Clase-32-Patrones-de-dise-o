package org.jhonatan.patrones.decorator.decorador;

import org.jhonatan.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
