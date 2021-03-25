package exemplos;
import java.util.Scanner;
public class Exemplo27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //final string = "R10p5";
        double salario;
        System.out.println("Informe seu salário");
        salario = entrada.nextDouble();
        if(salario <= 600.00){
            System.out.println("Isento");
        } else if(salario <= 1200.00){
            System.out.println("20%");
        } else if(salario <= 2000.00){
            System.out.println("25%");
        } else {
            System.out.println("30%");
        }
        entrada.close();
    }    
}
