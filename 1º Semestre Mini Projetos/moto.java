
public class moto {

    boolean ligado;
    double velocidadeAtual;
    double velocidadeMaxima;
    int cilindrada;
    double combustivel;

    // Declaração dos métodos
    void ligar() {
        ligado = true;
        System.out.println("A moto está ligado");
    }

    void desligar() {
        ligado = false;
        System.out.println("A moto está desligado");
    }

    void buzinar() {
        System.out.println("BIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    void pararFarol() {
        System.out.println("a Moto parou no farol ");
    }

    void acelerar() {
        System.out.println("VRUMMMMMMMMMMMMMMMMM a moto");
    }

    int acelerar(double quantidade) {
        double novaVelocidade = velocidadeAtual + quantidade;
        velocidadeAtual = novaVelocidade;
        if (novaVelocidade >= velocidadeMaxima) {
            return -1;
        } else {
            return 0;
        }

    }

}
