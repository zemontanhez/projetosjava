public abstract class Conta {
        private int numero;
        private Double saldo;

        public Conta(int numero){
            this.numero = numero;
            this.saldo = 0.0;
        }
        public Conta(int numero, Double saldo){
            this.numero = numero;
            this.saldo = saldo;
        }
        public void ExibirDados(){ //printa dados da conta
            System.out.println("Conta: " + numero + " Saldo: " + saldo);
        }
        public String ObterDados(){ //retorna dados da conta
            return ("Conta: " + numero + " Saldo: " + saldo);
        }
        public Double getSaldo(){ //retorna dados da conta
            return saldo;
        }
        @Override // TODO Auto-generated method stub 
        public String toString() {
        return (numero + " Saldo: " + saldo);
        }
        public boolean deposito(Double valor){
            if (valor > 0){
                saldo += valor;
                return true;
            }
            return false;
        }
        public boolean saque(Double valor){
            if (valor > 0){
                saldo -= valor;
                return true;
            }
            return false;
        }
}
