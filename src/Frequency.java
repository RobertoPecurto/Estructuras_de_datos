import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static HashMap<String, Integer> frequencia (ArrayList<String> todsPalabras){
        HashMap<String, Integer> palabras = new HashMap<>();
        for (String palabra:todsPalabras) {
            int contador = 1;
            if (palabras.containsKey(palabra)){
                contador = palabras.get(palabra)+1;
            }
            palabras.put(palabra,contador);
        }
        return palabras;
    }

    public static void main(String[] args) {
        ArrayList<String> todsPalabras = new ArrayList<>();
        System.out.println("Introduce una palabra:");
        Scanner miScanner = new Scanner(System.in);
        String palabra;
        while (miScanner.hasNextLine()) {
            palabra = miScanner.nextLine();
            if (palabra.isEmpty()) {
             break;
            }
            todsPalabras.add(palabra);
        }
        System.out.println(frequencia(todsPalabras));
    }
}