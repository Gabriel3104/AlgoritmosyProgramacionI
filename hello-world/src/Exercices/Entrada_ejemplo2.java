package Exercices;

import javax.swing.*;

public class Entrada_ejemplo2 {
    public static void main(String [] args){
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");

        int edad_usuario = Integer.parseInt(edad);

        System.out.println("Hola " + nombre_usuario + " , tendras el año que viene " + (edad_usuario+1) + " años de edad");


    }
}
