package exemplos.exemplo03;


public class Pessoa {
    //atributos - caracteristicas, possui, é
    String nome;
    //métodos = ação, comportamento
    void apresentar(){
        System.out.println("Olá! Eu sou " + nome);
    }
    //construtor
    Pessoa(String nome){
        this.nome = nome; // this - o próprio objeto
    }
}
