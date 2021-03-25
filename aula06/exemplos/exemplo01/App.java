public class App {
    public static void main(String[] args) {
        Funcionario f =new Funcionario("Fernando", 2000);
        Gerente g = new Gerente("Amanda",3000,10);

        // g.nome = "Fernando";
        System.out.println(g.exibir());
        System.out.println(f.exibir());

        g.aumento(10.0);
        f.aumento(10.0);

        System.out.println(g.exibir());
        System.out.println(f.exibir());
    }
    }