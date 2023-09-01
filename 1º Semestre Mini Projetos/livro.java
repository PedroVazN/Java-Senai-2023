public class livro {

    String titulo;
    String autor;
    int numeroPaginas;
    int anoPublicacao;

    // Construtor
    public livro(String titulo, String autor, int numeroPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para exibir informações do livro

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

    public boolean ehAntigo() {
        return anoPublicacao < 2000;
    }
}