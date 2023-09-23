import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Número Positivo");
        }
        if (num<0){
            System.out.println("Número Negativo");
        }
        if (num == 0){
            System.out.println("È ZERU MANU !!!");

        }

        sc.close();

    }
    
}
