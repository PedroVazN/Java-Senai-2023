package moto;
public class moto {
    // criação dos atributos
    String nome;
    int cilidrandas = 0;
    int combustivel;
    boolean ligada;
    double velocidadeMáxima = 30;
    double velocidadeAtual;
    double velocidadeAtualizada;

    // criação dos métodos (açoes)

    // Metodo construtor pique Gustavo Molina Apelao
    public moto(String nome) {
        this.nome = nome;
    }

    String pegarnome() {
        return nome;
    }

    void ligar() {
        ligada = true;
        System.out.println(" O veiculo escolhido ligou");
    }

    void desligar() {
        ligada = false;
        System.out.println("O veiculo escolhido diligou");
    }

    void buzinar() {
        System.out.println("BIBI!!!!!!!!!!!");
    }

    int acelerar(double quantidade) {
        velocidadeAtualizada = velocidadeAtual + quantidade;
        velocidadeAtual = velocidadeAtualizada;
        if (velocidadeAtual > velocidadeMáxima) {
            System.out.println("Voce acabou batendo a moto, veiculando parando...");
            System.exit(0);
            return -1;
        } else {
            System.out.println("A velocidade tá normal cachorro");
            return 0;
        }

    }

}