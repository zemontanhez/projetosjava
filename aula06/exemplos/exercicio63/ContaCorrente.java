public class ContaCorrente extends Conta {
    final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero, Double saldo){
        super(numero, saldo);
    }
    public ContaCorrente(int numero){
        super(numero);
    }
    @Override
    public boolean saque(Double valor) {
        if(getSaldo() >= valor){
            return super.saque(valor);
        }
        return false;
    }
    @Override
    public boolean deposito(Double valor) {
        return super.deposito(valor - TAXA_DEPOSITO);
    }
    @Override // TODO Auto-generated method stub 
        public String toString() {
        return ("Conta Corrente número: " + super.toString());
        }
}
