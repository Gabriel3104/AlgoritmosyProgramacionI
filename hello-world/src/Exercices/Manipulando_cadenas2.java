package Exercices;

public class Manipulando_cadenas2 {
    public static void main (String [] args){
        String frase = "Hoy es un dia hermoso en la ciudad de Posadas";

        String frase_resumen = frase.substring(14, 45) + " para irnos al rio y pasarla lindo ";

        System.out.println(frase_resumen);

    }
}
