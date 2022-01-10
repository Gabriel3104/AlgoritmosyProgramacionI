package modelo;

public class Pandeiro {
    private float diametro;
    private String material;

    public Pandeiro(float diametro, String material){
        this.diametro = diametro;
        this.material = material;
    }

    public float getDiametro(){
        return diametro;
    }

    public void setDiametro(float diametro){
        this.diametro = diametro;
    }



    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

}
