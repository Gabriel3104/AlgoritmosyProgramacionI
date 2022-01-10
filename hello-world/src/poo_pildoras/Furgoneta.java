package poo_pildoras;

public class Furgoneta extends Coche{

    private int capacidad_carga;

    private int plazas_extra;

    public Furgoneta(int capacidad_carga, int plazas_extra){

        super(); //Llamar al constructor de la clase padre.

        this.capacidad_carga = capacidad_carga;

        this.plazas_extra = plazas_extra;
    }
}
