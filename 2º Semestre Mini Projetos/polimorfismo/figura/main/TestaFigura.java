package polimorfismo.figura.main;

import polimorfismo.figura.Circulo;
import polimorfismo.figura.Figura;
import polimorfismo.figura.Quadrado;
import polimorfismo.figura.Triangulo;

public class TestaFigura {

    public static void main(String[] args) {

        Figura figura1 = new Quadrado(3);
        Figura figura2 = new Circulo(2);
        Figura figura3 = new Triangulo(5, 2);

        System.out.println("\n" + "******POLIMORFISMO*********");
        System.out.println("A área do quadrado é: " + figura1.calcularArea() + "cm²" + "\n");
        System.out.println("A área do Circulo é: " + figura2.calcularArea() + "cm²" + "\n");
        System.out.println("A área do Triangulo é: " + figura3.calcularArea() + "cm²" + "\n");
    }
}
