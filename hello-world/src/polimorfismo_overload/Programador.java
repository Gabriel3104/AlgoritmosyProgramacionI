package polimorfismo_overload;

import javax.swing.*;

public class Programador extends Informaticos{
    //Utilizando Polimorfismo Overload.

    public void sueldo(int horas, double pagoH){
        JOptionPane.showMessageDialog(null, "El pago es: " + (horas*pagoH));
    }

    public void datos(String nombre, String apellido){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellido: " + apellido);

    }

    public void labores(String lab){
        JOptionPane.showMessageDialog(null, "Soy programador y " + " me dedico a " + lab);
    }
}
