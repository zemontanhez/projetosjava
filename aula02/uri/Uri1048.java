package uri;
import java.util.Scanner;
public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,t;
        a = entrada.nextDouble();
        if(a <= 400){
            t = 15;
        }else if(a <= 800) {
            t = 12;
        }else if(a <= 1200){
            t = 10;
        }else if(a <= 2000){
            t = 7;
        }else {
            t = 4;
        }
        System.out.printf("Novo salario: %.2f\n",(a * ((t / 100) + 1)));
        System.out.printf("Reajuste ganho: %.2f\n",(a*t/100));
        System.out.printf("Em percentual: %.0f %%",t);
        entrada.close();
    }    
}