import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Telefonos {
    public static void main(String[] args) {
        //OK
        Map<String, String> contactos = new HashMap<String, String>();
        contactos.put("Roberto", "684103462");
        contactos.put("Alberto", "965483265");
        contactos.put("Juan", "984658465");
        contactos.put("Antonio", "365248459");
        contactos.put("Lucía", "365458596");

        String contacto = Utilidades.leerCadena("Introduce el nombre de la persona que quieres saber el contacto");
        if (contactos.containsKey(contacto)){
            System.out.println(contactos.get(contacto));
        }else {
            System.out.println("El nombre " + contacto + " no existe en la lista");
        }
    }
}
