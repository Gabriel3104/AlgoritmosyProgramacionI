package guia_de_ejercicios;

public class guia {
    //a
    public int esParOImpar(int numero) {
        if (numero % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //b
    public int esImparOPar(int numero) {
        if (numero % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //c
    public int obtenerUnidad(int numero) {
        String x = Integer.toString(numero);
        String[] b = x.split("");
        int unidad = b.length - 1;
        String resultado = b[unidad];
        int conversion = Integer.parseInt(resultado);
        return conversion;
    }

    //d
    public int obtenerNumero(int numero){
        int resto = numero % 10;
        if (resto == 0){
            return numero - 10;
        }else{
            return numero - resto;
        }
    }

    //2.6
    public void imprimirNumerosPares(int a, int b) {

        for (int num = a; num <= b; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }

        }
    }


    //2.7
    public void imprimirNumerosTriangulares(int numerosN) {
        int iteraciones = 1;
        int resultado = 0;

        for (iteraciones = 1; iteraciones <= numerosN; iteraciones++) {

            if (iteraciones == 1) {
                resultado = iteraciones;
                System.out.println(iteraciones + "   " + resultado);
            }else {
                resultado = iteraciones + resultado;
                System.out.println(iteraciones + "   " + resultado);

            }

        }
    }

    public void calcularSegundos(int seconds) {
        int sec = seconds % 60;
        int minutes = seconds % 3600 / 60;
        int hours = seconds % 86400 / 3600;

        System.out.println(" Hour " + hours + " Minute " + minutes + " Seconds " + sec);
    }

}
