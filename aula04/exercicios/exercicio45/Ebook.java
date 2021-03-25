package exercicios.exercicio45;

public class Ebook {
    private String titulo, autor;
    private int pagina, totalPagina;
//inicialização
    public Ebook(String titulo, String autor, int pagina, int totalPagina) {
        setTitulo(titulo);
        setAutor(autor);
        setPagina(pagina);
        setTotalPagina(totalPagina);
    }
//SETs
    public void setTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }
    public void setAutor(String novoAutor) {
        autor = novoAutor;
    }
    public void setTotalPagina(int novoTotalPagina) {
        totalPagina = novoTotalPagina;
    }
    private void setPagina(int novoPagina) {
        if(novoPagina <= totalPagina){
        pagina = novoPagina;
        }else{
            pagina = totalPagina;
        }
    }
//Demais funções
    public void avancarPagina() {
        if (pagina < totalPagina) {
            pagina++;
        }
    }
    public void retrocederPagina() {
        if (pagina != 0) {
            pagina--;
        }
    }
    public void irParaPagina(int novaPagina) {
        if (novaPagina <= totalPagina) {
            pagina = novaPagina;
        }
    }
    public void exibirPagina() {
        System.out.println(pagina);
    }
    public void mostrarCapa() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("paginas: " + totalPagina);
    }
}
