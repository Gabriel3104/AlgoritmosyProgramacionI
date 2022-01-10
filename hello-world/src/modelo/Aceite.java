package modelo;

public class Aceite {
    private String tipo;
    private float medida;

    public Aceite(String tipo, float medida){
        this.tipo = tipo;
        this.medida = medida;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public float getMedida(){
        return medida;
    }

    public void setMedida(float medida){
        this.medida = medida;
    }
}
