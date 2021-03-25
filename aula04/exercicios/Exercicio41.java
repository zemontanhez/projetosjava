package exercicios;
import java.util.Scanner;

public class Exercicio41 {
        public static void main(String[] args) {
            boolean resultado;
            int x;
            Scanner entrada = new Scanner(System.in);
            x = entrada.nextInt();
            resultado = epar(x);
            if(resultado) {
                System.out.println("Numero "+ x +" é par.");
            } else {
                System.out.println("Numero "+ x +" é impar.");
            }
            entrada.close();
        }

    static boolean epar(int a){
        boolean resposta;
        if (a % 2 == 0){
            resposta = true;
        }else {
            resposta = false;
        }
        return resposta;
    }
}
