import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Altura {
    public static int numeroAlumnos (){
        return Utilidades.leerEntero("Introduce el número de alumnos que hay en la clase:");
    }


    public static double calcularMedia (ArrayList<Double> alturas){
        Double suma = 0D;
        for (Double altura : alturas){
            suma += altura;
        }
        return (suma / alturas.size());

    }

    public static int calcularAlumnosAlturaSuperior (ArrayList<Double> alturas, double media){
        int total = 0;
        for (Double altura : alturas){
            if (altura > media){
                total ++;
            }
        }
        return total;
    }

    public static int calcularAlumnosAlturaInferior (ArrayList<Double> alturas, double media){
        int total = 0;
        for (Double altura : alturas){
            if (altura < media){
                total ++;
            }
        }
        return total;
    }

    public static void mostrarResultados (ArrayList<Double> alturas){
        Double media = calcularMedia(alturas);
        int superior = calcularAlumnosAlturaSuperior(alturas, media);
        int inferior = calcularAlumnosAlturaInferior(alturas, media);
        System.out.println("Las alturas son:");
        for (Double altura : alturas) {
            System.out.print(altura + ", ");
        }
        System.out.println(" ");
        System.out.println("La altura media es " + media);
        System.out.println("El número de alumnos con la altura superior es: " + calcularAlumnosAlturaSuperior(alturas, media));
        System.out.println("El número de alumnos con la altura inferior es: " + calcularAlumnosAlturaInferior(alturas, media));
    }

    public static ArrayList<Double> leerAlturas (int numeroAlumnos){
        System.out.println("Introduce las alturas de los alumnos");
        Scanner miScanner = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<>();
        for (int i = 0; i < numeroAlumnos; i++) {
            alturas.add(miScanner.nextDouble());
        }
        return alturas;
    }

    public static void main(String[] args) {
        //OK
        int numAlumnos = numeroAlumnos();
        ArrayList<Double> alturas = leerAlturas(numAlumnos);
        mostrarResultados(alturas);
    }
}
