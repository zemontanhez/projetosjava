public class Animal {
    private String nome,raca;
    private Integer anoNascimento;
    private Proprietario proprietario;

    public Animal(String nomeAnimal, String raca, int anoNascimento, Proprietario proprietario){
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
        
    }
    public Animal(String nomeAnimal, String raca, int anoNascimento, String nomeProprietario, String telefone){
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario(nomeProprietario,telefone);
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Animal: " + nome + "raça " + raca + " nascimento " + anoNascimento + " Proprietario> " + proprietario;
    }


}
