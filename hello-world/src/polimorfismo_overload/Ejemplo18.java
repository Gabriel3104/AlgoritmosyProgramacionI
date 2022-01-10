package polimorfismo_overload;

public class Ejemplo18 {
    public static void main(String[] args) {
        Programador Programador = new Programador();
        Analista Analista = new Analista();
        AdministradorBD AdministradorBD = new AdministradorBD();

        Programador.datos("Gabriel","Saleha");
        Programador.sueldo(8,500);
        Programador.labores("Programar");

        Analista.datos("Alejandro", "Villalba", "Eldorado 55");
        Analista.sueldo(8,500,1000);
        Analista.labores("Analizar datos",8);

        AdministradorBD.datos("Miguel");
        AdministradorBD.sueldo(400000);
        AdministradorBD.labores("administrar base de Datos");


    }
}
