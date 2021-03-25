import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        ContaCorrente cc;
        ContaEspecial ce;
        ContaPoupanca cp;
        double limite;

        do {
            System.out.println("1 - nova conta corrente");
            System.out.println("2 - nova conta especial");
            System.out.println("3 - nova conta poupança");
            System.out.println("4 - deposito");
            System.out.println("5 - saque");
            System.out.println("6 - Consultar saldo");
            System.out.println("7 - sair");
            System.out.print("Opção ==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
            case 1:
            System.out.println("Criando uma conta corrente...");
            System.out.println("Informe o numero da conta: ");
            numeroConta = teclado.nextInt();
            cc = new ContaCorrente(numeroConta);
                break;

            case 2:
            System.out.println("Criando uma conta especial...");
            System.out.println("Informe o numero da conta: ");
            numeroConta = teclado.nextInt();
            System.out.println("Informe o limite da conta: ");
            limite = teclado.nextDouble();
            ce = new ContaEspecial(numeroConta, limite);
                break;

            case 3:
            System.out.println("Criando uma conta poupança...");
            System.out.println("Informe o numero da conta: ");
            numeroConta = teclado.nextInt();
            cp = new ContaPoupanca(numeroConta);
                break;

            case 4:
            System.out.println("Efetuando um deposito...");
                break;

            case 5:
            System.out.println("Efetuando um saque...");
                break;

            case 6:
            System.out.println("Consultando saldo...");
                break;

            case 7:
            System.out.println("Saindo...");
                break;

            default:
            System.out.println("Opção inválida!");
                break;
            }

        } while (opcao != 7);
        teclado.close();
    }
}
