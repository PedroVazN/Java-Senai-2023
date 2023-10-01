package tarefas2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefasArrow { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        List<Tarefas1> listaTarefas = new ArrayList<>();

        Tarefas1 newTarefa1 = new Tarefas1("Fazer coco", "lol");
        Tarefas1 newTarefa2 = new Tarefas1("Lavar a louça", "lol");
        Tarefas1 newTarefa3 = new Tarefas1("Jogar Free Fire", "lol");

        System.out.println("Bem Vindo ao Gerenciador de Tarefas");

        while (true) {

            System.out.println("1- Ver Tarefas");
            System.out.println("2- Adicionar Uma Nova Tarefa?");
            System.out.println("3- Sair");
            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:

                    System.out.println("1- Ver Tarefa 1");
                    System.out.println("2- Ver Tarefa 2");
                    System.out.println("3- Ver Tarefa 3");
                    System.out.println("4- Ver Tarefas Adicionadas");
                    int escolhaTarefa = sc.nextInt();

                    if (escolhaTarefa == 1) {
                        System.out.println(newTarefa1.exibirTarefas());
                    } else if (escolhaTarefa == 2) {
                        System.out.println(newTarefa2.exibirTarefas());
                    } else if (escolhaTarefa == 3) {
                        System.out.println(newTarefa3.exibirTarefas());
                    } else if (escolhaTarefa == 4) {
                        for (Tarefas1 tarefa : listaTarefas) {
                            System.out.println(tarefa.exibirTarefas());
                        }
                    } else {
                        System.out.println("Opção Inválida");
                    }
                    break;

                case 2:

                    System.out.println("Criar tarefa?");
                    String response = sc.next();

                    if (response.equals("y")) {
                        Tarefas1 novaTarefa = new Tarefas1("", "");

                        System.out.println("Qual o nome da tarefa?");
                        String nome = sc.next();
                        novaTarefa.setTitulo(nome);

                        System.out.println("Qual a descrição da tarefa?");
                        String descrever = sc.next();
                        novaTarefa.setDescricao(descrever);

                        System.out.println("Qual o status?");
                        int status = sc.nextInt();
                        novaTarefa.setStatus(status);

                        listaTarefas.add(novaTarefa);
                        System.out.println("Tarefa adicionada com sucesso!");
                    }

                    break;

                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
