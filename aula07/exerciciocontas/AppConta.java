import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;
        GerenciaContas contas = new GerenciaContas();
        
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
                numeroConta = contas.novaContaCorrente();
                System.out.println("Conta criada: " + numeroConta);
                System.out.println("---------------------------------------------------");
                break;

            case 2:
                System.out.println("Criando uma conta especial...");
                System.out.println("Informe o limite da conta: ");
                limite = teclado.nextDouble();
                numeroConta = contas.novaContaEspecial(limite);
                System.out.println("Conta criada: " + numeroConta);
                System.out.println("---------------------------------------------------");
                break;

            case 3:
                System.out.println("Criando uma conta poupança...");
                numeroConta = contas.novaContaPoupanca();
                System.out.println("Conta criada: " + numeroConta);
                System.out.println("---------------------------------------------------");
                break;

            case 4:
                System.out.println("Efetuando um deposito...");
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Informe o valor do depósito: ");
                valor = teclado.nextDouble();
                if (contas.depositar(numeroConta, valor)) {
                    System.out.println("Operação de depósito realizada com sucesso!");
                    System.out.println("Saldo atualizado: ");
                    System.out.println(contas.consultarConta(numeroConta));
                    System.out.println("---------------------------------------------------");
                } else {
                    System.out.println("Operação não realizada!");
                    System.out.println("---------------------------------------------------");
                }
                break;

            case 5:
                System.out.println("Efetuando um saque...");
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Informe o valor do saque: ");
                valor = teclado.nextDouble();
                        if (contas.sacar(numeroConta, valor)) {
                            System.out.println("Operação de saque realizada com sucesso!");
                            System.out.println("Saldo atualizado: ");
                            System.out.println(contas.consultarConta(numeroConta));
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("Operação não realizada!");
                        }
                        break;
            case 6:
                System.out.println("Iniciando consulta de saldo...");
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println(contas.consultarConta(numeroConta));
                break;

            case 7:
                System.out.println("Saindo...");
                System.out.println("******************************************************");

                break;

            default:
                System.out.println("Opção inválida!");
                System.out.println("-------------------------------");
                break;
            }

        } while (opcao != 7);
        teclado.close();
    }
}
