package uri;
import java.util.Scanner;
/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
([0,25], (25,50], (50,75], (75,100]) este valor se encontra.

*/
public class Uri1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a;
        a = entrada.nextDouble();
        if(a > 100 || a < 0){
            System.out.println("Fora de intervalo");
        }else if(a <= 25){
            System.out.println("Intervalo [0,25]"); 
        }else if(a <= 50){
            System.out.println("Intervalo (0,50]"); 
        }else if(a <= 75){
            System.out.println("Intervalo (0,75]"); 
        }else {
            System.out.println("Intervalo (0,100]"); 
        }
        entrada.close();
    }    
}
