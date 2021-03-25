package exemplos;
import java.util.Scanner;
public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if(num > 0){
            System.out.println("O número é maior que zero");
        }
        else if(num < 0){
            System.out.println("O número é menor que zero");
        }
        else{
            System.out.println("O número é zero");
        }
        entrada.close();
    }    
}
