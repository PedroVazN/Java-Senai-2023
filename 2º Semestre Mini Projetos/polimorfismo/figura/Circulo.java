package polimorfismo.figura;

public class Circulo extends Figura { // Herança

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Cálculo da área do Círculo
    // Sobreposição do método da SuperClasse

    public double calcularArea(){
        double area = 0;
        area = Math.PI * (raio * raio);
        return area;
    }

}
