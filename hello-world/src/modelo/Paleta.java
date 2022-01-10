package modelo;

public class Paleta {
    private String modelo;
    private float peso;
    private String color;

    public Paleta( String modelo, float peso, String color){
        this.modelo = modelo;
        this.peso = peso;
        this.color = color;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }



    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }



    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
