public class Carro {

    String modelo;
    int anoFabricação;
    String cor;

    // Método Construtor

    public Carro(String modelo, int anoFabricado, String cor) {
        this.modelo = modelo;
        this.anoFabricação = anoFabricado;
        this.cor = cor;
    }

    // Método para exibir as informações do carro

    public void exibirInformacoes() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricação);
        System.out.println("Cor: " + cor);

    }

}
