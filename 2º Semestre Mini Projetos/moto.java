public class moto {
    // criação dos atributos

    int cilidrandas = 0;
    String combustivel;
    boolean ligada;
    double velocidadeMáxima = 30;
    double velocidadeAtual;
    double velocidadeAtualizada;

    // criação dos métodos (açoes)

    void ligar() {
        ligada = true;
        System.out.println(" O veiculo está ligado papae");
    }

    void desligar() {
        ligada = false;
        System.out.println(" A Moto DILIGOU");
    }

    void buzinar() {
        System.out.println("BIBI!!!!!!!!!!!");
    }

    int acelerar(double quantidade) {
        velocidadeAtualizada = velocidadeAtual + quantidade;
        velocidadeAtual = velocidadeAtualizada;
        if (velocidadeAtual > velocidadeMáxima) {
            System.out.println("A velocida esta ultrapasada, a moto parou de funcionar ");
            return -1;
        } else {
            System.out.println("A velocidade tá normal cachorro");
            return 0;
        }

    }

}