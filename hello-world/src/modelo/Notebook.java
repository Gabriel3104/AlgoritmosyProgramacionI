package modelo;

public class Notebook {
    private String marca;
    private String procesador;
    private float precio;

    public Notebook(String marca, String procesador, float precio){
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getProcesador(){
        return procesador;
    }

    public void setProcesador(String procesador){
        this.procesador = procesador;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }
}
