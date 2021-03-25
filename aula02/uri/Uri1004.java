package uri;
import java.util.Scanner;
public class Uri1004 {
    public static void main(String[] args) {
        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        int num,res,c100,c50,c20,c10,c5,c2,c1;
        num = entrada.nextInt();
        //PROCESSAMENTO
        c100 = num / 100;
        res = num % 100;
        c50 = res / 50;
        res = res % 50;
        c20 = res / 20;
        res = res % 20;
        c10 = res / 10;
        res = res % 10;
        c5 = res / 5;
        res = res % 5;
        c2 = res / 2;
        c1 = res % 2;
        //SAIDA
        System.out.println(num);
        System.out.println(c100 + " nota(s) de R$ 100,00");
        System.out.println(c50 + " nota(s) de R$ 50,00");
        System.out.println(c20 + " nota(s) de R$ 20,00");
        System.out.println(c10 + " nota(s) de R$ 10,00");
        System.out.println(c5 + " nota(s) de R$ 5,00");
        System.out.println(c2 + " nota(s) de R$ 2,00");
        System.out.println(c1 + " nota(s) de R$ 1,00");

        entrada.close();
    }    
}
