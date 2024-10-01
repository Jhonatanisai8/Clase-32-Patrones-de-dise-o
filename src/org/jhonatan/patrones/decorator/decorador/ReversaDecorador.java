package org.jhonatan.patrones.decorator.decorador;

import org.jhonatan.patrones.decorator.Formateable;

public class ReversaDecorador
        extends TextoDecorador {

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder db = new StringBuilder(texto.darFormato());
        return db.reverse().toString();
    }

}
