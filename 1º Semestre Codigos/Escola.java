import java.util.Scanner;


public class Escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Digite a media:");
    double media = sc.nextDouble();
    System.out.println("Digite as faltas: ");
    int faltas = sc.nextInt();


    if ((media>=5.1 && media<=10) && faltas<=4){
        System.out.println("AP");
    }

    if (media==5 ||faltas>=5 && faltas <=19){
        System.out.println("rec");
    }

    if (media<5 || faltas>=20){
        System.out.println("rep");
    }
    sc.close();
    }
}
