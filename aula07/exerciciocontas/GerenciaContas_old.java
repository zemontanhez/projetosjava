import java.util.ArrayList;
public class GerenciaContas_old {
    private ArrayList<Conta> listaContas;

    public GerenciaContas_old(){
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta){
        listaContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        listaContas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta){
        listaContas.add(new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor){
        for (Conta conta : listaContas) {
            if (conta.getNumero() == numeroConta) {
                return conta.deposito(valor);
            }
        }
        return false; //conta nao encontrada
    }

    public boolean sacar(int numeroConta, double valor){
        for (Conta conta : listaContas) {
            if (conta.getNumero() == numeroConta) {
                return conta.saque(valor);
            }
        }
        return false; //conta nao encontrada
    }

    public String consultarConta(int numeroConta){
        for (Conta conta : listaContas) {
            if(conta.getNumero() == numeroConta){
                return(conta.toString());
            }
        }
        return "Conta não encontrada";
    }
}
