package exemplos;
import java.util.Stack;
public class Exemplo01 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(33);
        pilha.push(22);
        pilha.push(11);
        pilha.push(10);


        System.out.println("tamanho: " + pilha.size());
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Removendo: " + pilha.pop());
        System.out.println("Removendo: " + pilha.pop());
        System.out.println("tamanho: " + pilha.size());

        while(!pilha.isEmpty()){
            System.out.println("Removendo: " + pilha.pop());
        }

    }
}
