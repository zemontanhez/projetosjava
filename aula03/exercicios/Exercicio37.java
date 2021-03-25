import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media,x;
        int aluno,turma;
        for(turma=1;(turma <= 3);turma++){
            media = 0;
            for(aluno=1;aluno<=4;aluno++){
                System.out.println("Forneça a média do aluno " + aluno + " da turma " + turma +":");
                x = entrada.nextDouble();
                media += x;
            }
            media /= aluno - 1;
            System.out.println("A média geral da turma " + turma + " é: " + media);
        }
        entrada.close();
    }    
}
