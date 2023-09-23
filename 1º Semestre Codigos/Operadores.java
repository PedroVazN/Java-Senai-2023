// Importando o Scanner

import java.util.Scanner;

public class Operadores{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, n3,n4;
        double soma, subtracao, mult, div;
        int resto =30;

        System.out.println("Resto da divisão: "+resto%4);
        System.out.println("Resto da divisão 2: "+resto%5);
        System.out.println("Resto da divisão 3: "+resto%9);
        System.out.println("Digite um número: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextDouble();
        System.out.println("Digite o 3º número: ");
        n3 = sc.nextDouble();
        System.out.println("Digite o 4º número: ");
        n4 = sc.nextDouble();
        //Operadores Aritméticos -> +, -, *, /, resto(%)
        soma = n1+n2+n3+n4; 
        subtracao = n1 -n2 -n3-n4;
        mult = n1*n2*n3*n4;
        div = n1/n2/n3/n4;
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+div);
        sc.close();
    }
}


