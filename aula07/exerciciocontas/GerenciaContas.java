
//import java.util.ArrayList;
import java.util.HashMap;

public class GerenciaContas {
    // private ArrayList<Conta> listaContas;
    private HashMap<Integer, Conta> hashContas;
    private GerarNumero gerarNumero;

    public GerenciaContas() {
        hashContas = new HashMap<>();
        gerarNumero = new GerarNumero();
    }

    public int novaContaCorrente() {
        int numeroConta = gerarNumero.proximo();
        hashContas.put(numeroConta, new ContaCorrente(numeroConta));
        return numeroConta;
    }

    public int novaContaEspecial(double limite) {
        int numeroConta = gerarNumero.proximo();
        hashContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
        return numeroConta;
    }

    public int novaContaPoupanca() {
        int numeroConta = gerarNumero.proximo();
        hashContas.put(numeroConta, new ContaPoupanca(numeroConta));
        return numeroConta;
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta = hashContas.get(numeroConta);
        if (conta != null) {
            return conta.deposito(valor);
        }
        return false; // conta nao encontrada
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = hashContas.get(numeroConta);
        if (conta != null) {
            return conta.saque(valor);
        }
        return false; // conta nao encontrada
    }

    public String consultarConta(int numeroConta) {
        Conta conta = hashContas.get(numeroConta);
        if (conta != null) {
            return (conta.toString());
        }
        return "Conta não encontrada";
    }
}
