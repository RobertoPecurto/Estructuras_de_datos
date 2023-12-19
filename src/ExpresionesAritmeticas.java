import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(" ");
    }

    public static int calcular (String expresion){
        String[] datos = expresion.split(" ");
        Stack<Integer> pila = new Stack<>();
        int n1, n2, resultado;
        for (int i = 0; i < datos.length; i++) {
            switch (datos[i]){
                case"+":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultado=n1+n2;
                    pila.push(resultado);
                    break;
                case "-":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultado=n1-n2;
                    pila.push(resultado);
                    break;
                case "*":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultado=n1*n2;
                    pila.push(resultado);
                    break;
                case "/":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultado=n1/n2;
                    pila.push(resultado);
                    break;
                default:
                    pila.push(Integer.parseInt(datos[i]));
                    break;
            }
        }
        return pila.pop();
    }
}
