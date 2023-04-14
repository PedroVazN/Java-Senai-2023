package Aula01;
/*
 * Constante -> Variável em Java em que não posso alterar o valor usamos a palavra chave FINAL
*/

public class Exemplo02 {

    public static final int TAXA = 10;
    public static final double PI = 3.14;

    // public -> A Constante pode ser acessada em qualquer parte do código.
    // static -> Essa Constante é compartilhada entre todas as classes do meu
    // progama.
    // final -> Não posso alterar o valor.

         public static void main(String[] args) {

        System.out.println("A taxa da loja é de: " +TAXA+"%");
        System.out.println("Pi vale: "             + PI);


    }
}
