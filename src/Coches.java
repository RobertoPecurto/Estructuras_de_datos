import java.util.ArrayList;
import java.util.Collections;

public class Coches {

    public static void main(String[] args) {

        ArrayList<String> coches = new ArrayList<>();
        String coche;
        do {
        coche = Utilidades.leerCadena("Introduce un coche (cadena vacía para acabar)");
        if (coche.length() != 0){
            coches.add(coche);
        }
        } while (coche.length() != 0);

        Collections.sort(coches);

        for (String coch : coches) {
            System.out.println(coch);
        }
    }
}
