package polimorfismo_overload;

import javax.swing.*;

public class Analista extends Informaticos{
    public void sueldo(int horas, int pagoH, int incentivo){
        JOptionPane.showMessageDialog(null, "El pago es: " + ((horas*pagoH) + incentivo));
    }

    public void datos(String nombre, String apellido, String direccion){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion);

    }

    public void labores(String lab,int horas){
        JOptionPane.showMessageDialog(null, "Soy Analista y " + " me dedico a Analizar datos. " + horas + "horas");
    }
}
