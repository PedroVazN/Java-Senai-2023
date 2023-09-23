import java.util.Scanner;

public class TestaMoto {
    public static void main(String[] args) {

        moto yamaha = new moto();
        moto biz = new moto();
        moto eskaite = new moto();

        biz.velocidadeMáxima = 90;
        biz.velocidadeAtual = 10;
        yamaha.velocidadeMáxima = 120;
        yamaha.velocidadeAtual = 25;
        eskaite.velocidadeMáxima = 80;
        eskaite.velocidadeAtual = 5;

        yamaha.ligar();
        System.out.println("A velocidade Atual da Yamaha: " + yamaha.velocidadeAtual);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você quer acelerar a Yamaha?");
        double valor = sc.nextDouble();

        yamaha.acelerar(valor);

        if (yamaha.velocidadeAtual > yamaha.velocidadeMáxima) {
            System.out.println("Você ultrapassou a velocidade máxima da Yamaha!");
            yamaha.velocidadeAtual = yamaha.velocidadeMáxima; // Define a velocidade atual para a máxima.
        }

        System.out.println("A velocidade da Yamaha agora é: " + yamaha.velocidadeAtual + "km/h\n");
        System.out.println("Ops, acabou a gasolina.\nQual tipo de combustível você quer?\n1 = Gasolina\n2 = Álcool");
        int valorG = sc.nextInt();

        if (valorG == 1) {
            System.out.println("Você escolheu Gasolina.\n");
        } else if (valorG == 2) {
            System.out.println("Você escolheu Álcool.\n");
        }

        System.out.println("Ligando a Biz.......");
        biz.ligar();
        System.out.println("A velocidade Atual da Biz é: " + biz.velocidadeAtual + "km/h\n");

        System.out.println("Quanto você quer acelerar a Biz?");
        double valor2 = sc.nextDouble();
        biz.acelerar(valor2);

        if (biz.velocidadeAtual > biz.velocidadeMáxima) {
            System.out.println("Você ultrapassou a velocidade máxima da Biz!");
            biz.velocidadeAtual = biz.velocidadeMáxima; // Define a velocidade atual para a máxima.
        }

        System.out.println("A velocidade da Biz agora é: " + biz.velocidadeAtual + "km/h\n");

        System.out.println("Ops, acabou a gasolina.\nQual tipo de combustível você quer?\n1 = Gasolina\n2 = Álcool");
        int valorG1 = sc.nextInt();

        if (valorG1 == 1) {
            System.out.println("Você escolheu Gasolina.\n");
        } else if (valorG1 == 2) {
            System.out.println("Você escolheu Álcool.\n");
        }

        System.out.println("Ligando a Eskaite......");
        eskaite.ligar();

        System.out.println("Quanto você quer acelerar o Eskaite?");
        double valor3 = sc.nextDouble();
        eskaite.acelerar(valor3);

        if (eskaite.velocidadeAtual > eskaite.velocidadeMáxima) {
            System.out.println("Você ultrapassou a velocidade máxima do Eskaite!");
            eskaite.velocidadeAtual = eskaite.velocidadeMáxima; // Define a velocidade atual para a máxima.
        }

        System.out.println("A velocidade do Eskaite agora é: " + eskaite.velocidadeAtual + "km/h\n");

        System.out.println("Ops, acabou a gasolina.\nQual tipo de combustível você quer?\n1 = Gasolina\n2 = Álcool");
        int valorG2 = sc.nextInt();

        if (valorG2 == 1) {
            System.out.println("Você escolheu Gasolina.\n");
        } else if (valorG2 == 2) {
            System.out.println("Você escolheu Álcool.\n");
        }

        sc.close();
    }
}

