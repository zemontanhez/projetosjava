package exemplos;
import java.util.Scanner;
public class Exemplo22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1,nota2;
        System.out.println("Informe num1");
        nota1 = entrada.nextDouble();
        System.out.println("Informe num2");
        nota2 = entrada.nextDouble();

        if(nota1 > nota2){
            System.out.println("> " + nota1 + " " + nota2);
        }
        else{
            System.out.println("> " + nota2 + " " + nota1);
        }
        entrada.close();
    }
}
