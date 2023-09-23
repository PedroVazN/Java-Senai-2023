import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        boolean continuar = true;
        int opc;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("***Menu de opções do Senai***\n");
            System.out.println("1 - Prestar atenção na aula \n");
            System.out.println("2 - Fazer todos os exercícios \n");
            System.out.println("3 - NÃO falar palavrão\n");
            System.out.println("4 - NÃO dormir na aula");
            System.out.println("0 - Sair do Menu\n");

            System.out.println("Digite a opção desejada");
            opc = sc.nextInt();

            if(opc==0){
                continuar=false;
                System.out.println("POGRAMA ENCERRADÚ MANO!");

            }
           
        }
        
        while (continuar);
        sc.close();
        
    }
}
