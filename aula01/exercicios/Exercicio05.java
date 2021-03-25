package exercicios;
import java.util.Scanner;
/*
Custo carro novo = soma custo de fabrica, porcentagem distribuidor(28%) e impostos(45% aplicados ao custo de fabrica)
ler custo de fábrica e calcular custo final e imposto pago.
*/
public class Exercicio05 {
    public static void main(String[] args) {
        //entrada
        Scanner entrada = new Scanner(System.in);
        double custoFabrica,custoFinal;
        System.out.println("Digite o custo de fabricação do automóvel: ");
        custoFabrica = entrada.nextDouble();
        //processamento
        custoFinal = custoFabrica + custoFabrica*0.28 + custoFabrica*0.45;
        //saida
        System.out.println("O valor em reais do preço de venda do carro será: " + custoFinal);
        System.out.println("O valor em reais dos impostos a serem pagos nessa transação será: " + (custoFabrica*0.45));
        entrada.close();
    }
}
