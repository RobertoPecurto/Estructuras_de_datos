import java.util.ArrayList;

public class Existe {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(18);
        lista.add(6);
        lista.add(3);
        lista.add(1);
        lista.add(8);

        int repe = Utilidades.leerEntero("Introduce un número:");

        if (lista.contains(repe)){
            System.out.println(repe + " se encontró en la lista");
        } else {
            System.out.println(repe + " no se encontró en la lista");
        }
    }
}
