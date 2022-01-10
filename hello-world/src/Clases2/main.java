package Clases2;

import Clases.Person;

public class main {
    public static void main(String[] args) {

        Person Juan = new Person("juan",25,1);
        Account account = new Account( Juan ,10500);
        account.mostrar();
        System.out.println(Juan.mostrar());
        System.out.println(Juan.getAge());
        account.setAmount(25.5F + account.getAmount());
        System.out.println(account.getAmount());
        account.retirar(10000F);
        System.out.println(account.getAmount());







    }
}
