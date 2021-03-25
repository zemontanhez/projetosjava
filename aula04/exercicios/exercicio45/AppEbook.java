package exercicios.exercicio45;

public class AppEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Titulo do meu livro",
         "Autor do meu livro", 1, 50);

        ebook.exibirPagina();
        ebook.mostrarCapa();
        ebook.avancarPagina();
        ebook.exibirPagina();
        ebook.retrocederPagina();
        ebook.exibirPagina();
        ebook.irParaPagina(38);
        ebook.exibirPagina();
    }
}
