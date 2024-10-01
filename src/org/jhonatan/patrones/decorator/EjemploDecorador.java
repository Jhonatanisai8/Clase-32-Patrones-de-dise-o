package org.jhonatan.patrones.decorator;

import org.jhonatan.patrones.decorator.decorador.MayusculaDecorador;
import org.jhonatan.patrones.decorator.decorador.ReemplazarEspacioDecorador;
import org.jhonatan.patrones.decorator.decorador.ReversaDecorador;
import org.jhonatan.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Jhonata!.");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subra = new SubrayadoDecorador(reversa);
        ReemplazarEspacioDecorador reemplazar = new ReemplazarEspacioDecorador(texto);

        System.out.println(reversa.darFormato());
        System.out.println(reemplazar.darFormato());
        System.out.println(subra.darFormato());
        System.out.println(mayuscula.darFormato());
    }
}
