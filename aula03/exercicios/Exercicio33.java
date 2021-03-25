import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,count;
        System.out.println("Informe o valor de N");
        n = entrada.nextInt();
        count = 1;
        while(count <= n){
            if(count==1){
                System.out.print(count);
            } else {
                System.out.print(", " + count);
            }
            count *= 2;
        }
        entrada.close();
    }    
}