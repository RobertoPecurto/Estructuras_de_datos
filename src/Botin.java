import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Botin {
    public static void main(String[] args) {
        int[] billetes = {2,10,20,50,200,500};
        int participantes = billetes[0];
        System.out.println(repartir(participantes, billetes));
    }

    public static String repartir (int participantes, int ... billetes){
        HashMap<Integer, ArrayList<Integer>> rep = new HashMap<>();
        ArrayList<Integer> billetesrep = new ArrayList<>();
        for (int i = 0; i < rep.size(); i++) {
            billetesrep.add(billetes[i % participantes]);
        }

        return billetesrep.toString();
    }
}
