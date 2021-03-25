package exemplos;
import java.util.Scanner;
public class Exemplo24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario,valor;
        System.out.println("Informe salario bruto");
        salario = entrada.nextDouble();
        System.out.println("Informe valor da prestação");
        valor = entrada.nextDouble();

        if(valor > salario*0.3){
            System.out.println("> Empréstimo recusado");
        }
        else{
            System.out.println("> Empréstimo concedido");
        }
        entrada.close();
    }
}
