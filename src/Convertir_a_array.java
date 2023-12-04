import java.util.ArrayList;

public class Convertir_a_array {
    public static void main(String[] args) {
        ArrayList<String> directores = new ArrayList<>();
        directores.add("Nolan");
        directores.add("Tarantino");
        directores.add("Spilberg");
        directores.add("Aster");

        String[] str = new String[directores.size()];
        for (int i = 0; i < directores.size(); i++) {
            str[i] = directores.get(i);
        }

        for (String st : str) {
            System.out.println(st);
        }
    }
}
