import java.util.Scanner;

public class atv04 {
    


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double lado1, area;

        System.out.println("Escreva o Valor do 1ºLado: ");
        lado1 = sc.nextDouble();
        area=(lado1*lado1);

        System.out.println(" O resultado da área do quadrado é: " + area);

        sc.close();

    }
}

