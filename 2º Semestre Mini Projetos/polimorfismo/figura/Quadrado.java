package polimorfismo.figura;

public class Quadrado extends Figura { // Herança

    double lado;

    public Quadrado(double lado) { // Metodo Constutor
        this.lado = lado;
    }

    //Declarando o cálculo de área do Quadrado
    //Sobreposição do método da Superclasse

    public double calcularArea(){
        double area = 0;
        return area = lado * lado;
    }


}
