package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        double salario;
        System.out.println("Digite o salario atual: ");
        salario = entrada.nextDouble();
        //processamento
        salario = salario * 1.25;
        //saido de dados
        System.out.println("Seu novo salário será: " + salario);
        entrada.close();
    }
}
