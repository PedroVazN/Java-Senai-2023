package simulacao;
import java.util.Scanner;
import java.util.Random;

public class SimulacaoAula {
    public static void main(String[] args) {
        int dia = 1;
        int inteligencia = 0;
        try (Scanner sc = new Scanner(System.in)) {
            Random vouatrapaia = new Random();

            System.out.println("\nPOV VOCE ESTA EM UM DIA NO SENAI\n");

            while (true) {
                System.out.println("Dia " + dia);

                System.out.println("Você chegou à escola. Escolha um curso para estudar:");
                System.out.println("1. Java");
                System.out.println("2. HTML");
                System.out.println("3. CSS");
                System.out.println("4. JavaScript");

                int escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("\nVocê escolheu estudar Java!");
                        System.out.println("10+ de Inteligencia\n");
                        inteligencia += 10;
                        break;
                    case 2:
                        System.out.println("\nVocê escolheu estudar HTML!");
                        System.out.println("10+ de Inteligencia\n");
                        inteligencia += 10;
                        break;
                    case 3:
                        System.out.println("\nVocê escolheu estudar CSS!");
                        System.out.println("10+ de Inteligencia\n");
                        inteligencia += 10;
                        break;
                    case 4:
                        System.out.println("\nVocê escolheu estudar JavaScript!");
                        System.out.println("10+ de Inteligenciaa\n");
                        inteligencia += 10;
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha um curso válido.");
                }

                System.out.println("É hora do lanche!");

                System.out.println("Você voltou para a sala até as 10 horas? (Digite '1' para sim ou '0' para não)");
                int resposta = sc.nextInt();
                System.out.println("");

                if (resposta == 0) {
                    System.out.println("Você tomou falta por não voltar à sala a tempo.");
                    break;
                }
                    if (resposta == 1) {
                    System.out.println("Pode seguir o dia normal o gusgus nao ficou bravo");
                }

                /*
                 * public boolean nextBoolean() {
                 * return next(1) != 0;
                 * }
                 */

                if (vouatrapaia.nextBoolean()) {
                    System.out.println("\n2 MENINAS COMEÇOU A GRITAR PLRLH E ATRAPALHOU AULA MENOS 30 DE INTELIGENCIA\n");
                    inteligencia -= 30;
                }

                System.out.println("Sua inteligência atual: " + inteligencia);

                dia++;
                System.out.println("Repetindo o dia...\n");

            }
        }
    }
}
