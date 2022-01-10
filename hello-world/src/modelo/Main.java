package modelo;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Gabriel",28,1.85f);

        System.out.println(persona.getNombre());
        persona.setNombre("jose");
        System.out.println(persona.getNombre());


        Casco casco = new Casco(10,"RS1","Negro");

        Pandeiro pandeiro = new Pandeiro(1.5f, "Madera");

        Auto auto = new Auto("Rojo",4,"Amarok");

        Paleta paleta = new Paleta("Lagrima",1.5f,"Celeste");

        Libro libro = new Libro("Precalculo","Tito Canete","Puerto de palos");

        Aceite aceite = new Aceite("Comestible", 1.2f);

        Zapatilla zapatilla = new Zapatilla(1.7f, "Adidas","Gris");

        Perro perro = new Perro("Tobi", "Pastor aleman", "Marron");

        Notebook notebook = new Notebook("Lenovo", "I3",75.000f);
    }

}
