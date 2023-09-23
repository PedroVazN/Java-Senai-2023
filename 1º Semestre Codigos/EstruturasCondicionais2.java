import java.util.Scanner;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário");
        double salario = sc.nextDouble();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        int idadeDeMaior = 18;
        double salarioMinimo = 1320;

        if (salario>salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é Maior de idade e ganha mais de 1 salario mínimo.");
        }
        if (salario<salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é Maior de idade e ganha MENOS de 1 salario mínimo.");
        }
        if (salario==salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é Maior de idade e ganha  1 salario mínimo.");
        }
        sc.close();
    }
    
}
