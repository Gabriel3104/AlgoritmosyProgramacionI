package modelo;

public class Casco {
    private int medida;
    private String marca;
    private String color;

    public Casco (int medida, String marca, String color){
        this.medida = medida;
        this.marca = marca;
        this.color = color;
    }

    public int getMedida(){
        return medida;
    }

    public void setMedida(int medida){
        this.medida = medida;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}

