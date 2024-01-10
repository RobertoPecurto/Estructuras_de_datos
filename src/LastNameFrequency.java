import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LastNameFrequency {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/LastnameFrequencies.csv"));
        String line;
        HashMap<String, String> cuantos = new HashMap<>();
        String apellido;
        while ((line = reader.readLine()) != null) {
            String repet;

            String[] actual = line.split(",");
            if (actual.length == 2){
                apellido = actual[0];
                repet = actual[1];
                repet  = repet.replaceAll("\\.","");
                cuantos.put(apellido, repet);
            }
        }

        while (true){
            apellido = Utilidades.leerCadena("Introduce un apellido en MAYÚSCULAS");
            if (apellido.isEmpty()){
                reader.close();
                System.exit(0);
            }
            System.out.println(cuantos.get(apellido));
        }
    }
}