package exemplos;
import java.util.Scanner;
public class Exemplo21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if(num > 20){
            num = num/2;
            System.out.println("O número é maior que 20 e sua metade é: " + num);
        }
        else{
            System.out.println("O número não é maior que 20");
        }
        entrada.close();
    }
}
