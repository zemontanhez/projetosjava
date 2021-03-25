import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String digitado;


        try {
            System.out.println("Digite um valor inteiro: ");
            digitado = entrada.nextLine();
            numero = Integer.parseInt(digitado);
            //numero = entrada.nextInt();
            System.out.println("Você digitou " + numero);
        } catch (InputMismatchException ex) {
            System.out.println("Digitação inválida.");
            System.out.println(ex.getMessage());
            // ex.printStackTrace();
        } catch(NumberFormatException ex){
            System.out.println("Digitação inválida.");
            System.out.println(ex.getMessage());
            // ex.printStackTrace();
        } catch(Exception ex){
            System.out.println("Erro generico");
            System.out.println(ex.getMessage());
        } finally{ // Sempre é executado
            System.out.println("finally");
            entrada.close();
        }

        System.out.println("Final");
    }
}
