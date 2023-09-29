package moto;
import java.util.Scanner;

public class TestaMoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarando as moto né papae

        moto yamaha = new moto("Yamaha");
        yamaha.velocidadeMáxima = 120;
        yamaha.velocidadeAtual = 0;
        yamaha.combustivel = 10;

        moto biz = new moto("Biz");
        biz.velocidadeMáxima = 90;
        biz.velocidadeAtual = 0;
        biz.combustivel = 8;

        moto eskaite = new moto("Eskaite");
        eskaite.velocidadeMáxima = 80;
        eskaite.velocidadeAtual = 0;
        eskaite.combustivel = 6;

        while (true) {
            moto motoSelecionada = null; 

            System.out.println("Escolha a moto para andar:");
            System.out.println("1 - Yamaha");
            System.out.println("2 - Biz");
            System.out.println("3 - Eskaite");
            System.out.println("0 - Sair");

            int escolha = sc.nextInt();

            if (escolha == 0) {
                System.out.println("Saindo do programa.");
                break;
            }

            switch (escolha) {
                case 1:
                    motoSelecionada = yamaha;
                    break;
                case 2:
                    motoSelecionada = biz;
                    break;
                case 3:
                    motoSelecionada = eskaite;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    continue;
            }

            System.out.println("A moto selecionada é: " + motoSelecionada.pegarnome());

            motoSelecionada.ligar();

            while (true) {
                System.out.println("Escolha uma ação:");
                System.out.println("1 - Acelerar");
                System.out.println("2 - Desligar a moto");
                System.out.println("0 - Trocar de moto ou sair");

                int acao = sc.nextInt();

                if (acao == 0) {
                    System.out.println("Trocando de moto ou saindo.");
                    motoSelecionada.desligar();
                    break;
                }

                switch (acao) {
                    case 1:
                        System.out.println("Quanto você quer acelerar?");
                        double valor = sc.nextDouble();
                        double consumo = valor / 10;

                        if (consumo > motoSelecionada.combustivel) {
                            System.out.println("Combustível insuficiente. Abastecer?");
                            System.out.println("1 - Gasolina");
                            System.out.println("2 - Álcool");
                            int escolhaCombustivel = sc.nextInt();
                            if (escolhaCombustivel == 1) {
                                // Abastecer com gasolina
                                motoSelecionada.combustivel = 10; // Recarregar o tanque
                            } else if (escolhaCombustivel == 2) {
                                // Abastecer com álcool
                                motoSelecionada.combustivel = 8; // Recarregar o tanque
                            } else {
                                System.out.println("Escolha inválida. Saindo da moto.");
                                motoSelecionada.desligar();
                                break;
                            }
                        }

                        motoSelecionada.acelerar(valor);
                        motoSelecionada.combustivel -= consumo;

                        System.out.println("A velocidade atual é: " + motoSelecionada.velocidadeAtual + "km/h");
                        System.out.println("Nível de combustível restante: " + motoSelecionada.combustivel + " litros");
                        break;
                    case 2:
                        System.out.println("Desligando a moto.");
                        motoSelecionada.desligar();
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente.");
                        break;
                }
            }
        }

        sc.close();
    }
}
//Eu amo Free fire

