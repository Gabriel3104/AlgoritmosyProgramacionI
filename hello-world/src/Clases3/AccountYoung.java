package Clases3;

import Clases.Person;
import Clases2.Account;

public class AccountYoung extends Account {

    private float bonus;

    public AccountYoung(Person headline, float amount, float bonus) {
        super(headline, amount);
    }

    public float getBonus(){
        return bonus;
    }

    public void setBonus(float bonus){
        this.bonus = bonus;
    }

    public boolean esTitularValido(){
        boolean esMayordeEdad = headline.esMayorDeEdad();

        if (esMayordeEdad && headline.getAge()<=25){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void retirar(Float cantidad){
        if(esTitularValido()){
            super.retirar(cantidad);
        }
    }

    @Override
    public void mostrar(){
        System.out.println("Cuenta Joven. " + " Y La bonificacion es: 0.5");
    }

}
