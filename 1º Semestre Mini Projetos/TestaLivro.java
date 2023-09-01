public class TestaLivro {
    public static void main(String[] args) {

        livro livro1 = new livro("Ladrão de Casaca", "Maurice Leblanc", 192, 1907);

        livro livro2 = new livro("Arsène Lupin contra Herlock Sholmes", "Maurice Leblanc", 312, 1906);

        livro livro3 = new livro("Romeu e Julieta", "William Shakespeare", 248, 1968);

        livro livro4 = new livro("Arsène Lupin contra Herlock Sholmes", "Maurice Leblanc", 224, 1909);

        System.out.println("Livro 1:");
        livro1.exibirInformacoes();
        System.out.println("É antigo? " + livro1.ehAntigo());

        System.out.println("\nLivro 2:");
        livro2.exibirInformacoes();
        System.out.println("É antigo? " + livro2.ehAntigo());

        System.out.println("\nLivro 3:");
        livro3.exibirInformacoes();
        System.out.println("É antigo? " + livro3.ehAntigo());

        System.out.println("\nLivro 4:");
        livro4.exibirInformacoes();
        System.out.println("É antigo? " + livro4.ehAntigo());
    }
}
