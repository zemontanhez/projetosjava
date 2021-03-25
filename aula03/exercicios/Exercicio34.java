import java.util.Scanner;
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numcount,x,soma;
        soma = 0;
        x = 1;
        numcount = 1;
        while(x != 0){
        System.out.print("Digite o " + numcount + "° número(0 para receber a soma)> ");
        x = entrada.nextInt();
        soma += x;
        numcount++;
        }
        System.out.println("A soma dos valores é: " + soma);
        entrada.close();
    }    
}
