package Clases;

import java.security.KeyStore;

public class Person {

    private String name;
    private Integer age;
    private Integer ID;


    public Person(String name, Integer age, Integer ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Integer getID(){
        return ID;
    }

    public void setID(Integer ID){
        this.ID = ID;

    }

    public String mostrar(){
        return "name : " + this.name  + ". age : " + this.age + ". ID : " + this.ID ;
    }

    public boolean esMayorDeEdad() {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
