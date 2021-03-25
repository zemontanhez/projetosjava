public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome,String telefone,double salario){
        super(nome,telefone);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Telefone: " + telefone + "Salário: R$" + salario;
    }
}
