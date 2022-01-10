package Exercices;

import javax.management.PersistentMBean;

public class Manipulando_cadenas {
    public static void main (String [] args) {

        String nombre= "Gabriel";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("El mismo tiene " + nombre.length() + " letras ");

        System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));

    }
}
