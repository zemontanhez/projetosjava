public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero){
        super(numero);
        limite = 1000;
    }
    public ContaEspecial(int numero, Double limite){
        super(numero);
        this.limite = limite;
    }
    @Override
    public boolean saque(Double valor) {
        if(getSaldo() + limite >= valor){
        return super.saque(valor);
        }
        return false;
    }
    @Override // TODO Auto-generated method stub 
        public String toString() {
        return ("Conta Especial número: " + super.toString() + " Limite: " + limite);
        }
    }
