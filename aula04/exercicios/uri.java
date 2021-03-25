package exercicios;
import java.util.Scanner;
public class uri {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota,media;
        int count;
        count = 0;
        media = 0;

        while(count < 2){
            nota = entrada.nextDouble();
            if(nota < 0 || nota > 10){
                System.out.println("nota invalida");
            } else {
                media += nota;
                count = count + 1;
            }
        }
        System.out.printf("media = %.2f\n",media/2);
        entrada.close();
    }
}
