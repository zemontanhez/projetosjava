package uri;
import java.util.Scanner;
public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,t;
        a = entrada.nextDouble();
        if(a <= 2000){
            t = 0;
        }else if(a <= 3000) {
            t = (a - 2000)*0.08;
        }else if(a <= 4500){
            t = 80 + (a-3000)*0.18;
        }else{
            t = 350 + (a-4500)*0.28;
        }
        if(t==0){
            System.out.println("Isento");
        }else{
            System.out.printf("R$ %.2f\n",t);
        }
        entrada.close();
    }    
}
