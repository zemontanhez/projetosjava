package exemplos;
import java.util.Scanner;
public class Exemplo25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //final string = "R10p5";
        String senha;
        System.out.println("Informe sua senha");
        senha = entrada.nextLine();
        if(senha.equals("R10p5")){
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado!");
        }
        entrada.close();
    }    
}
