package Clases2;

import Clases.Person;

public class Account {

    protected Person headline;
    private Float amount;

    public Account(Person headline, float amount) {
        this.headline = headline;
        this.amount = amount;
    }

    public Person getHeadline() {
        return headline;
    }

    public void setHeadline(Person headline) {
        this.headline = headline;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void mostrar() {
        System.out.println(" Persona: " + this.headline.mostrar() + " amount: " + this.amount);

    }

    public void ingresar(Float cantidad) {
        if (cantidad > 0) {
            amount = amount + cantidad;
        }
    }

    public void retirar(Float cantidad) {
        amount = amount - cantidad;
    }


}








