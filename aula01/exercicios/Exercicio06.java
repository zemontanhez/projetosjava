package exercicios;
import java.util.Scanner;
/*
1 pé = 12 polegadas / 1 jarda = 3 pés / 1 milha = 1760 jardas / 1km = 0,62137 milhas
receber valor em km
*/
public class Exercicio06 {
    public static void main(String[] args) {
        //entrada
        Scanner entrada = new Scanner(System.in);
        double medida;
        System.out.println("Digite a medida em km: ");
        medida = entrada.nextDouble();
        //processamento
        //saida
        medida = medida * 0.62137;
        System.out.printf("Medida em Milhas: %.3f\n", medida);
        medida = medida * 1760;
        System.out.printf("Medida em Jardas: %.3f\n", medida);
        medida = medida * 3;
        System.out.printf("Medida em Pés: %.3f\n", medida);
        medida = medida * 12;
        System.out.printf("Medida em Polegadas: %.3f\n ", medida);
    }    
}
