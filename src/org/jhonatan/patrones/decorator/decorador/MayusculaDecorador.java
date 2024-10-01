package org.jhonatan.patrones.decorator.decorador;

import org.jhonatan.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador {

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }

}
