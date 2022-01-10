package polimorfismo_override;

import javax.swing.*;

public class AdministradorBD extends Informaticos{
    @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null, "El pago de un AdministradorBD es $" + pago);
    }

    @Override
    public void datos(String nombre){
        JOptionPane.showMessageDialog(null, "El nombre del AdministradorBD es " + nombre);
    }

    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null, "Las labores de un Administrador son " + labor);
    }
}
