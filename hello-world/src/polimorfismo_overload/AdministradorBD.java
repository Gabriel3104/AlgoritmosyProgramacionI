package polimorfismo_overload;

import javax.swing.*;

public class AdministradorBD{
    public void sueldo(double pago){

        JOptionPane.showMessageDialog(null, "El pago es: " + pago);
    }

    public void datos(String nombre){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre );

    }

    public void labores(String lab){
        JOptionPane.showMessageDialog(null, "Soy AdministradorBD y " + "me dedico a " + lab);
    }
}
