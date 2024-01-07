import java.io.*;
import java.util.*;

public class anagramas {
    public static void main(String[] args) throws IOException {
        //OK. Aunque me huele a ChatGPT
        int minGroupSize =100;

        Map<String,List<String>> m = new HashMap<String,List<String>>();

        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));

        String line;
        while ((line = reader.readLine())!=null) {
            String alpha = alfabetize(line);
            List<String> l = m.get(alpha);
            if (l == null){
                l = new ArrayList<>();
                l.add(line);
                m.put(alpha,l);
            } else {
                l.add(line);
            }
        }
        reader.close();

        for (List<String> l : m.values()) {
            if (l.size() >= minGroupSize){
                System.out.println(l.size() + ":" + l);
            }
        }

    }
    public static String alfabetize (String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}

