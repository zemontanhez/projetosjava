public abstract class Pessoa {
    public String nome;
    public String telefone;

    public Pessoa(String nome,String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Telefone: " + telefone;
    }
}
