package Clases3;

import Clases.Person;

public class main {
    public static void main(String[] args) {
        Person Juan = new Person("Juan",22,1);
        AccountYoung accountYoung = new AccountYoung(Juan,80000F,0.5f);
        accountYoung.retirar(30.5f);
        accountYoung.ingresar(50000f);
        accountYoung.getAmount();
        System.out.println(accountYoung.getAmount());
        accountYoung.retirar(50000f);
        System.out.println(accountYoung.getAmount());
        accountYoung.mostrar();



    }
}
