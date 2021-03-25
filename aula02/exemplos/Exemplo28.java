package exemplos;
import java.util.Scanner;
public class Exemplo28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Entrada de dados
        double a,b,c;
        System.out.println("Informe a");
        a = entrada.nextDouble();
        System.out.println("Informe b");
        b = entrada.nextDouble();
        System.out.println("Informe c");
        c = entrada.nextDouble();
        //Processamento
        if((a > b+c) || (b > a+c) || (c > a+b)){
            System.out.println("Medidas não formam um triangulo!");
        } else if((a==b) && (b==c)){
            System.out.println("Triangulo equilátero.");
        } else if((a==b) || (b==c) || (a==c)){
            System.out.println("Triangulo isósceles.");
        } else {
            System.out.println("Triangulo escaleno.");
        }
        entrada.close();
    }    
}
