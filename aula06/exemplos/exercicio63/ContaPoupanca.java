public class ContaPoupanca extends Conta {
    private static Double taxa = 0.1; //static - torna a variavel atributo fixo da classe e não por objeto

    public ContaPoupanca(int numero, Double saldo) {
        super(numero, saldo);
    }
    public ContaPoupanca(int numero){
        super(numero);
    }
    @Override
    public boolean saque(Double valor) {
        if(getSaldo() >= valor){
            return super.saque(valor + valor*taxa);
        }
        return false;
    }
    @Override // TODO Auto-generated method stub 
        public String toString() {
        return ("Conta Poupança número: " + super.toString() + " Taxa: " + taxa);
        }
    public static void setTaxa(double novaTaxa){
        if(taxa > 0){
            taxa = novaTaxa;
        }
    }
}
