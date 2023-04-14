// Tipos de variáveis em Java
/* 
    * String   ->Armazena texto
    * char     ->Armazena uma única letra
    * int      ->números inteiros
    * float    ->número decimais
    * double   ->números decimais. Maior precisão
*/

/*
    * Toda variável DEVE começar com letra minúscula
    * Não pode haver espaço no nome da variável
    * nomeAluno, enderecoCliente, produtoAdquirido 
*/

public class Exemplo01 {

    public static void main(String[] args) {

        String nome = "Pedro Vaz";
        int idade = 13;
        boolean chuva = true;           // Em variáveis booleanas eu uso true or false
        char letra = 'P';               // Toda char DEVE estar simples ''
        double salario = 26245.34;
        float altura = (float) 1.78;    //  Estou convertendo um double para float

        System.out.println("Meu nome é:"               + nome);
        System.out.println("minha idade é : "          + idade);
        System.out.println("Está chovendo? "           + chuva);
        System.out.println("A inicial do meu nome é: " + letra);
        System.out.println("Meu salário é: "           + salario); 
        System.out.println("Minha altura é: "          + altura + " metros");

        









    }
}