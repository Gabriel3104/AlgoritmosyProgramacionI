package polimorfismo_override;

import javax.swing.*;

public class Programador extends Informaticos{
    @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null, "El pago de un programador es $" + pago);
    }

    @Override
    public void datos(String nombre){
        JOptionPane.showMessageDialog(null, "El nombre del programador es " + nombre);
    }

    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null, "Las labores de un programador son " + labor);
    }
}
