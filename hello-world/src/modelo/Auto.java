package modelo;

public class Auto {
    private String color;
    private int puertas;
    private String modelo;

    public Auto(String color, int puertas, String modelo){
        this.color = color;
        this.puertas = puertas;
        this.modelo = modelo;

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }



    public int getPuertas(){
        return puertas;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }



    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

}
