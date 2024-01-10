import java.util.ArrayList;
import java.util.HashMap;

public class Botin {
    public static void main(String[] args) {
        System.out.println(repartir(2, 10, 20, 50, 200, 500));
    }

    public static HashMap<Integer, String> repartir (int participantes, int ... billetes){
        HashMap<Integer, String> repartdos = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int billete : billetes) {
            list.add(billete);
        }

        do {
            for (int i = 0; i < participantes; i++) {
                int actual = list.get(0);
                if (repartdos.containsKey(i)){
                    repartdos.replace(i, repartdos.get(i) + " , " + actual);
                }else repartdos.put(i, String.valueOf(actual));
                list.remove(0);

                if (list.isEmpty()){
                    break;
                }
            }

        }while (!list.isEmpty());

        return repartdos;
    }
}