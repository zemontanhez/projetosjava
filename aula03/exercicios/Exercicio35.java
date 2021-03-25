import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par,x,c,impar;
        impar = 0;
        c = 1;
        par = 0;
        while(c < 11){
        System.out.println("Digite o " + c + "° número: ");
        x = entrada.nextInt();
        if((x%2)==0){
            par++;
        }else {
            impar++;
        }
        c++;
        }
        System.out.println("O total de numeros pares é: " + par);
        System.out.println("O total de numeros impares é: " + impar);
        entrada.close();
    }    
}
