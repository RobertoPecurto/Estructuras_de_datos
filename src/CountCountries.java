import java.io.*;
import java.util.*;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String line;
        HashMap<String, Integer> cuantas = new HashMap<>();
        while ((line = reader.readLine())!=null) {
            String[] datos = line.split(",");
            String pais = datos[6];
            int vez = 1;
            if (cuantas.containsKey(pais)){
                vez = cuantas.get(pais) + 1;
            }
            cuantas.put(pais, vez);
        }
        System.out.println(cuantas);
    }
}
