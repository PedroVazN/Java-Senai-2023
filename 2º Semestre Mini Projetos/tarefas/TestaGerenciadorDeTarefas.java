package tarefas;

import java.util.Scanner;

public class TestaGerenciadorDeTarefas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tarefas newTarefa1 = new Tarefas("Jogar", "Jogar Valorant e Subir uns Capas");
        Tarefas newTarefa2 = new Tarefas("Chamar o GusGus",
                "Chamar o gusGus para jogar um free firezinho dos cria né papai");
        Tarefas newTarefa3 = new Tarefas("Ir No Banheiro", "Epa a maçaneta quebrou kkkk");
        Tarefas t1 = new Tarefas(null, null);
        Tarefas t2 = new Tarefas(null, null);
        Tarefas t3 = new Tarefas(null, null);

        System.out.println("Bem Vindo ao Gerenciador de Tarefas");

        while (true) {
            System.out.println("=====  MENU  ====");
            System.out.println("1- Ver Tarefas");
            System.out.println("2- Adicionar Uma Nova Tarefa?");
            System.out.println("4- Gerenciar Tarefas");
            System.out.println("3- Sair");
            int escolha = sc.nextInt();
            System.out.println("");

            switch (escolha) {

                case 1:
                    System.out.println("=====  VER TAREFAS  ====");
                    System.out.println("1- Ver Tarefa 1");
                    System.out.println("2- Ver Tarefa 2");
                    System.out.println("3- Ver Tarefa 3");
                    System.out.println("4- Ver Tarefas Adicionadas");
                    int escolhaTarefa = sc.nextInt();

                    if (escolhaTarefa == 1) {
                        System.out.println("\n=====  EXIBINDO TAREFA  ====");
                        newTarefa1.exibirTarefas();
                         System.out.println("");
                       
                    } else if (escolhaTarefa == 2) {
                        System.out.println("\n=====  EXIBINDO TAREFA  ====");
                        newTarefa2.exibirTarefas();
                       System.out.println("");
                    } else if (escolhaTarefa == 3) {
                        System.out.println("\n=====  EXIBINDO TAREFA  ====");
                        newTarefa3.exibirTarefas();
                         System.out.println("");
                        
                    } else if (escolhaTarefa == 4) {
                        System.out.println("\n=====  EXIBINDO TAREFA ADICIONADAS  ====");
                        t1.exibirTarefas();
                        t2.exibirTarefas();
                        t3.exibirTarefas();
                         System.out.println("");
                       

                    } else {
                        System.out.println("Opção Inválida");
                    }
                    break;

                case 2:
                    System.out.println("=====  ADICIONAR TAREFA  ====");
                    System.out.println("Slots disponíveis: 1, 2 e 3");
                    System.out.println("Qual slot deseja preencher?");
                    int slot = sc.nextInt();
                    System.out.println("");

                    Tarefas tarefaSelecionada = null;

                    switch (slot) {
                        case 1:
                            tarefaSelecionada = t1;
                            break;
                        case 2:
                            tarefaSelecionada = t2;
                            break;
                        case 3:
                            tarefaSelecionada = t3;
                            break;
                        default:
                            System.out.println("Slot inválido");
                            break;
                    }

                    if (tarefaSelecionada != null) {
                        if (tarefaSelecionada.getTitulo() == null) {
                            System.out.println("Criar tarefa?");
                            String response = sc.next();
                            if (response.equals("y")) {
                                System.out.println("Qual o nome da tarefa?");
                                String titulo1 = sc.next();
                                tarefaSelecionada.setTitulo(titulo1);

                                System.out.println("Qual a descrição da tarefa?");
                                String descricao1 = sc.next();
                                tarefaSelecionada.setDescricao(descricao1);

                                System.out.println("Tarefa adicionada com sucesso!");
                            }
                        } else {
                            System.out.println("");
                            System.out.println("Slot ocupado");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);
                    break;

                case 4:
                    System.out.println("=====  GERENCIAR TAREFAS  ====");
                    System.out.println("Qual tarefa deseja alterar o status?");
                    System.out.println("1 - Tarefa 1");
                    System.out.println("2 - Tarefa 2");
                    System.out.println("3 - Tarefa 3");
                    System.out.println("4 - Tarefa Adicionada 1");
                    System.out.println("5 - Tarefa Adicionada 2");
                    System.out.println("6 - Tarefa Adicionada 3");

                    int gerenciarn = sc.nextInt();

                    Tarefas tarefaGerenciada = null;

                    switch (gerenciarn) {
                        case 1:
                            tarefaGerenciada = newTarefa1;
                            break;
                        case 2:
                            tarefaGerenciada = newTarefa2;
                            break;
                        case 3:
                            tarefaGerenciada = newTarefa3;
                            break;
                        case 4:
                            tarefaGerenciada = t1;
                            break;
                        case 5:
                            tarefaGerenciada = t2;
                            break;
                        case 6:
                            tarefaGerenciada = t3;
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }

                    if (tarefaGerenciada != null) {
                        System.out.println("Deseja concluir a tarefa? (y) or (n)");
                        String resposta = sc.next();
                        if (resposta.equals("y")) {
                            tarefaGerenciada.setStatus(1);
                            System.out.println("Status alterado para Completo!");
                        } else if (resposta.equals("n")) {
                            tarefaGerenciada.setStatus(0);
                            System.out.println("Status alterado para Incompleto!");
                        } else {
                            System.out.println("Resposta inválida");
                        }
                    }
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
}
