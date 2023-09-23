/*Operadores Lógicos

&& -> E
|| -> OU
!= -> Diferente
== -> Verifica o conteúdo das variáveis

IF -> Se 
ELSE -> Senão

*/

import java.util.Scanner;

public class VerificaParImpar{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();

        if (num%2==0){ // Se o resto da divisão for zero
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
        sc.close();
    }
}