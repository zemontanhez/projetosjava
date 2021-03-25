public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome){
        this.nome = nome;
        this.salario = 0;
    }
    public Funcionario(){ //default

    }
    public String exibir() {
        return nome + " : " + salario;
    }

    public void aumento(Double x) {
        this.salario = salario*(1+x/100);
    }
}
