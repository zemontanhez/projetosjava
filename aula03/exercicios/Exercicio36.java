import java.util.Scanner;
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par,x,c,impar,somapar;
        somapar = 0;
        impar = 0;
        c = 1;
        par = 0;
        while(c < 11){
        System.out.println("Digite o " + c + "° número: ");
        x = entrada.nextInt();
        if((x%2)==0){
            par++;
            somapar += x;
        }else {
            impar++;
        }
        c++;
        }
        System.out.println("A media dos valores pares é: " + ((double)somapar/par));
        System.out.println("A porcentagem de números ímpares é: " + impar*10 + "%");
        entrada.close();
    }    
}
