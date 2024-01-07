import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelefonosII {
    public static void main(String[] args) {
        //OK
        ArrayList<String> telefonos = new ArrayList<>();
        HashMap<String, ArrayList<String>> numerosTelef = new HashMap<>();
        telefonos.add("684 10 34 62");
        telefonos.add("639 85 31 33");
        numerosTelef.put("Roberto", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("569 23 45 65");
        telefonos.add("156 14 98 65");
        numerosTelef.put("Lucía", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("658 45 78 95");
        telefonos.add("964 58 78 65");
        numerosTelef.put("Juan", telefonos);

        String contacto = Utilidades.leerCadena("Introduce el nombre de la persona que quieres saber el contacto");
        if (numerosTelef.containsKey(contacto)){
            System.out.println(numerosTelef.get(contacto));
        }else {
            System.out.println("El nombre " + contacto + " no existe en la lista");
        }
    }
}
