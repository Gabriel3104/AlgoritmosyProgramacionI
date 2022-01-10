package modelo;

public class Zapatilla {
    private float talla;
    private String marca;
    private String color;

    public Zapatilla(float talla, String marca, String color){
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public float getTalla(){
        return talla;
    }

    public void setTalla(float talla){
        this.talla = talla;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
