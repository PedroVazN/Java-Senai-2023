package veiculo;

public class TestaVeiculos {
    public static void main(String[] args) {

        Veiculos carro = new Carro("Audi");
        Veiculos bicicleta = new Bicicleta("Volkswagen");

        System.out.println("\nO Carro andou por 50km em 2 horas logo sua velocidade é:");
        System.out.println("A velocidade do carro é: " + carro.calcularVelocidadeMaxima() + "km/h\n");
        System.out.println("A Bike andou por 8km em 1 hora e meia logo sua velocidade é: ");
        System.out.println("A velocidade da bike  é: " + bicicleta.calcularVelocidadeMaxima() + "\n");
        
        carro.imprimirDescricao();
        bicicleta.imprimirDescricao();
        System.out.println("");
    
}
}
