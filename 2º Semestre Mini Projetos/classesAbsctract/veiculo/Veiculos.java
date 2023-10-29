package veiculo;

abstract class Veiculos {
    String marca;

    public Veiculos(String marca) {
        this.marca = marca;
    }

    public abstract double calcularVelocidadeMaxima();

    public abstract void imprimirDescricao();


}

class Carro extends Veiculos {
    public Carro(String marca) {
        super(marca);
        
    }

    double velocidade;
    double deslocamento;
    double tempo;

    @Override
    public double calcularVelocidadeMaxima() {
        deslocamento = 50;
        tempo = 2;
        return velocidade = (deslocamento/tempo);
    }

    @Override
    public void imprimirDescricao() {
        System.out.println(marca + " - Carro");
    }

    public double getTempo() {
        return tempo;
    }
    public double getDeslocamento() {
        return deslocamento;
    }

}

class Bicicleta extends Veiculos {
    public Bicicleta(String marca) {
        super(marca);
    }
    
    double velocidade;
    double deslocamento;
    double tempo;


    @Override
    public double calcularVelocidadeMaxima() {
        deslocamento = 8;
        tempo = 1.5;
        return velocidade = (deslocamento/tempo);
    }

    @Override
    public void imprimirDescricao() {
        System.out.println(marca + " - Bicicleta");
    }

}