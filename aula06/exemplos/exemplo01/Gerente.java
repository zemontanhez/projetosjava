public class Gerente extends Funcionario {
    private int numeroFuncionarios;
    public Gerente(String nome,double salario,int funcionarios){

        super(nome, salario); // chamada ao construtor de Funcionario
        numeroFuncionarios = funcionarios;
    }
    @Override
    public void aumento(Double x) {
        // TODO Auto-generated method stub
        super.aumento(x + 20);
    }
}
