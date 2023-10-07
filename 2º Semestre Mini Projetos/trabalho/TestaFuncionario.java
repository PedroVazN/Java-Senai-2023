package trabalho;

import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario("Maria", "Atendente", 2500);
        Gerente gerente = new Gerente("João", 5000);
        //Atendente atendente = new Atendente("Pedro", "Atendente", 1320);

        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1 - Fazer um Pedido");
            System.out.println("2 - Ver Atendente");
            System.out.println("3 - Ver Gerente");
            System.out.println("5 - Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("   PEDIDOS   ");
                    System.out.println("Deseja fazer um pedido?");
                    System.out.println("");
                    String resposta = sc.next();

                    if (resposta.equals("y")) {
                        Pedido pedido = new Pedido(null, 0);
                        pedido.setNumero(1);

                        System.out.println(" ** Pedido  **  ");
                        System.out.println("");
                        System.out.println("1- Big Mac");
                        System.out.println("2- Big Taist");

                        int escolhaF = sc.nextInt();

                        switch (escolhaF) {
                            case 1:
                                pedido.setNome("Big Mac");
                                System.out.println("--  Pedido Realizado  --");
                                System.out.println(pedido.getNome());
                                System.out.println(pedido.getNumero());

                                // Adicionar bônus ao gerente (5% do salário)
                                double bonus = gerente.getSalario() * 0.05;
                                double bonusf = funcionario.getSalario() * 0.02;

                                  System.out.println("===========================  BÔNUS ADICIONADO  =====================================\n");

                                System.out.println("Bônus de 5% adicionado ao salário do Gerente.");
                                System.out.println("Salário atual do Gerente: R$ " + gerente.adicionarBonus(bonus));
                                System.out.println("Bônus de 2% adicionado ao salário do Gerente.");
                                System.out.println("Salário atual do Funcionario: R$ " + gerente.adicionarBonus(bonusf));
                                System.out.println("OBRIGADO PELA COMPRA");
                                System.out.println("\n================================================================");
                                sc.close();
                                System.exit(0);
                                break;

                            case 2:
                                pedido.setNome("Big Taist");
                                System.out.println("--  Pedido Realizado  --");
                                System.out.println(pedido.getNome());
                                System.out.println(pedido.getNumero());

                                double bonus1 = gerente.getSalario() * 0.05;
                                double bonusf2 = funcionario.getSalario() * 0.02;

                                System.out.println("===========================  BÔNUS ADICIONADO  =====================================\n");
                                System.out.println("Bônus de 5% adicionado ao salário do Gerente.");
                                System.out.println("Salário atual do Gerente: R$ " + gerente.adicionarBonus(bonus1));
                                System.out.println("Bônus de 2% adicionado ao salário do Gerente.");
                                System.out.println("Salário atual do Funcionario: R$ " + gerente.adicionarBonus(bonusf2));
                                System.out.println("OBRIGADO PELA COMPRA");
                                System.out.println("\n================================================================");
                                sc.close();
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Opção de pedido inválida.");
                                break;
                        }
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 2:
                    System.out.println("Nome: "+funcionario.getNome());
                    break;

                case 3:
                    System.out.println("Nome: "+gerente.getNome());
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
