import java.util.Scanner;

public class TesteMoto1 {

    public static void main(String[] args) {

        moto1 XJ6;
        XJ6 = new moto1();

        XJ6.ligar();
        XJ6.desligar();

        XJ6.velocidadeMaxima = 192;

        XJ6.cilindrada = 600;
        XJ6.combustivel = 55.5;

        moto1 S1000 = new moto1();

        S1000.velocidadeMaxima = 300;
        S1000.cilindrada = 999;
        S1000.combustivel = 69.69;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto voce quer acelerar");
        double valor = sc.nextDouble();
        int teste = XJ6.acelerar(valor);
        int teste2 = S1000.acelerar(valor);

        System.out.println("A velocidade atual da  XJ6 é " + XJ6.velocidadeAtual + "km/h.");
        System.out.println("A velocidade atual da S1000 é " + S1000.velocidadeAtual + "km/h.");

        if (teste == -1 || teste2 == -1) {
            System.out.println("A velocidade é igual ou superior a velocidade maxima");
        }
        if (XJ6.velocidadeAtual >= 120 || S1000.velocidadeAtual >= 120) {
            System.out.println("CARA, reduza a velocidade");

        }
        sc.close();

    }

}
