package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner entnota1 = new Scanner(System.in);
        double nota1,nota2,media;
        System.out.println("Digite a primeira nota: ");
        nota1 = entnota1.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entnota1.nextDouble();
        //Processamento
        media = (nota1 + nota2)/2 ;
        //Saida de dados
        System.out.println("A média entre as notas é: " + media);
        entnota1.close();

    }    
}
