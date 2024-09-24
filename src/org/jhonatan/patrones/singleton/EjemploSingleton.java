package org.jhonatan.patrones.singleton;

import java.util.concurrent.TimeUnit;

public class EjemploSingleton {

    public static void main(String[] args) throws InterruptedException {
        ConexionBDSingleton conB1 = null;
        for (int i = 0; i < 10; i++) {
            conB1 = ConexionBDSingleton.getInstancia();
            //opcional tiempo en que se imprime la primera conexion
            TimeUnit.SECONDS.sleep(1);
            System.out.println("con = " + conB1);
        }
        ConexionBDSingleton conB2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton conB3 = ConexionBDSingleton.getInstancia();

        //comparamos si las instancias son las mismas
        boolean sonIguales = ((conB1 == conB2) && (conB2 == conB3));

        System.out.println("¿Son iguales las instancias?: " + sonIguales);
    }
}
