import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Botin {
    public static void main(String[] args) {
        //No funciona bien
        System.out.println(repartir(2, 10, 20, 50, 200, 500));;
    }

    public static String repartir (int participantes, int ... billetes){
        HashMap<Integer, ArrayList<Integer>> rep = new HashMap<>();
        for (int i = 0; i < participantes; i++) {
            ArrayList<Integer> billetesrep = new ArrayList<>();
            for (int j = 0; j < billetes.length; j++) {
                int contador = 0;
                if (j==0){

                    billetesrep.add(billetes[0]);
                }else {
                    billetesrep.add(billetes[contador]);
                    contador += participantes;
                }
            }
            rep.put(i,billetesrep);
        }
        return rep.toString();
    }
}
