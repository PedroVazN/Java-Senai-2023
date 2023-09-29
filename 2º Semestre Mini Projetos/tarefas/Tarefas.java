package tarefas;

import java.util.Scanner;

public class Tarefas {
    private String titulo;
    private String descricao;
    private int status;

    Scanner sc = new Scanner(System.in);

    public Tarefas(String titulo, String descricao) {
        setTitulo(titulo);
        setDescricao(descricao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;

    }
    public void exibirTarefas() {
        String statusStr = (getStatus() == 1) ? "Completo" : "Incompleto";
        System.out.println("Título: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nConclusão: " + statusStr);
    }
    

    public void tarefasAdicionadas() {
        System.out.println("Tarefa adicionada com sucesso!");
        exibirTarefas();
    }
}
