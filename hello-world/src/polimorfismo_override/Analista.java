package polimorfismo_override;

import javax.swing.*;

public class Analista extends Informaticos {

    @Override
    public void sueldo(double pago) {
        JOptionPane.showMessageDialog(null, "El pago de un Analista es $" + pago);
    }

    @Override
    public void datos(String nombre) {
        JOptionPane.showMessageDialog(null, "El nombre del Analista es " + nombre);
    }

    @Override
    public void labores(String labor) {
        JOptionPane.showMessageDialog(null, "Las labores del Analista son " + labor);
    }
}