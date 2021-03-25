package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //entrada
        Scanner entrada = new Scanner(System.in);
        double salario,consumo,taxa,total;
        System.out.println("Digite o salario mínimo atual: ");
        salario = entrada.nextDouble();
        System.out.println("Digite a quantidade de quilowatss consumido: ");
        consumo = entrada.nextDouble();
        //processamento
        taxa  = salario / 500;
        total = taxa * consumo;
        //saida
        System.out.println("O valor em reias de cada quilowatss é: " + taxa);
        System.out.println("O valor total da conta a ser paga é: " + total);
        System.out.println("O valor da conta com desconte de 15% é: " + (total - total*0.15));
        entrada.close();
    }    
}
