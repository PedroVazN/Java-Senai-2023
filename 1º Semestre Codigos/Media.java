import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroAlunos = 0;
        double mediaTurma = 0;
        double mediaAluno = 0;

        System.out.println("======INSTRUÇÕES=====\n");
        System.out.println("Não digite notas negativas\n");
        System.out.println("Para encerrar o programa digite [-1]\n");

        while (mediaAluno != -1) { 
            System.out.println("Digite a média do aluno: ");
            mediaAluno = sc.nextDouble();
            if (mediaAluno != -1) {
                numeroAlunos++; // Estou incrementando os alunos (+1)
                mediaTurma += mediaAluno;
            }
        }
        mediaTurma = mediaTurma / numeroAlunos;

        System.out.println("A média da turma é: " + mediaTurma);
        System.out.println("A sala tem: "+numeroAlunos+" alunos");
        sc.close();
    }
}
