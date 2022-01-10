package polimorfismo_override;

public class main {
    public static void main(String[] args) {
        Programador programador = new Programador();
        Analista analista = new Analista();
        AdministradorBD administradorBD = new AdministradorBD();

        programador.datos("Gabriel");
        programador.sueldo(30000);
        programador.labores("Estudiar y programar");

        analista.datos("Alejandro");
        analista.sueldo(150000);
        analista.labores("Analizar datos");

        administradorBD.datos("Miguel");
        administradorBD.sueldo(400000);
        administradorBD.labores("Administrar");
    }
}
