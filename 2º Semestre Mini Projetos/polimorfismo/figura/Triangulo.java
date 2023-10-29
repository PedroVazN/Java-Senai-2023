package polimorfismo.figura;

public class Triangulo extends Figura {

    double altura;
    double base;

    public Triangulo(double altura, double base) {
         this.base = base;
         this.altura = altura;
    }

    public double calcularArea(){
        double area = 0;
        return area = (base * altura) / 2;
    }
    
}
