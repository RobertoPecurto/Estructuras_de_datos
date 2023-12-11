import java.util.HashMap;
import java.util.Map;

public class Capitales {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("España", "Madrid");
        mapa1.put("Portugal", "Lisboa");
        mapa1.put("Francia", "Paris");
        mapa1.put("Alemania", "Berlin");
        mapa1.put("Paises bajos", "Amsterdam");
        mapa1.put("Reino unido", "Londres");
        mapa1.put("Italia", "Roma");

        String pais = Utilidades.leerCadena("Introduce un país:");

        if (mapa1.containsKey(pais)){
            System.out.println(mapa1.get(pais));
        }else {
            System.out.println("El país " + pais + " no existe en la lista");
        }

    }
}
