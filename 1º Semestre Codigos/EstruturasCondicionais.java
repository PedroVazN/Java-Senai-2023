import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");

        int idade = sc.nextInt();
        
        int idadeDeMaior = 18;
        
        if(idade>=idadeDeMaior){//Se for verdade
            System.out.println("O aluno é maior de idade");
        }
        else{
            System.out.println("O aluno ainda não saiu da fralda =)");
        }
        sc.close();
    }
}
