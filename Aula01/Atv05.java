import java.util.Scanner;
public class Atv05{


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nome, endereco, telefone;
    double valorH, quantidadeT;
    float idade;




    System.out.println("Digite Seu Nome: " );
    nome= sc.nextLine();
    System.out.println("Digite seu endereco: ");
    endereco= sc.nextLine();
    System.out.println("Digite seu telefone");
    telefone= sc.nextLine();
    System.out.println("Digite Sua Idade: ");
    idade= sc.nextFloat();
    System.out.println("Digite as Horas que voce trabalhou: ");
    valorH= sc.nextDouble();
    System.out.println("Digite o valor por hora");
    quantidadeT= sc.nextDouble();
    System.out.println("O salário do Funcionário "+nome+" é: "+valorH*quantidadeT);

    sc.close();

    }
}