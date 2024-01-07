import java.util.ArrayList;
import java.util.HashMap;

public class TerminacionSorteo {
    public static HashMap<Integer, Integer> terminacion (ArrayList<String> boletos){
        HashMap<Integer, Integer> ultimoNum = new HashMap<>();
        for (String boleto:boletos) {
            int contador = 1;
            int ultimo = Integer.parseInt("" + boleto.charAt(boleto.length()-1));
            if (ultimoNum.containsKey(ultimo)){
                contador = ultimoNum.get(ultimo)+1;
            }
            ultimoNum.put(ultimo,contador);
        }
        return ultimoNum;
    }

    public static void main(String[] args) {
        //OK
        ArrayList<String> boletos = new ArrayList<>();
        boletos.add("58975");
        boletos.add("25894");
        boletos.add("52985");
        boletos.add("98598");

        System.out.println(terminacion(boletos));
    }
}
