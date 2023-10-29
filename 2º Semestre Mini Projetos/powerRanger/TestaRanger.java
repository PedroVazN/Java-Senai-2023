package powerRanger;
import java.util.Scanner;


public class TestaRanger {

    public static void main(String[] args) {
        
        System.out.println("\t" + "******It's Morphing Time*********\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Ranger Verde:\n");
        String nomeVerde = sc.nextLine();

        PowerRanger ranger1 = new PowerRangerVerde(nomeVerde);
        ranger1.morfar();
        
        System.out.println("Digite o nome do Ranger Preto:\n");
        String nomePreto = sc.nextLine();
        
        PowerRanger ranger2 = new PowerRangerPreto(nomePreto);
        ranger2.morfar();
        
        System.out.println("Digite o nome do Ranger Rosa:\n");
        String nomeRosa = sc.nextLine();
        
        PowerRanger ranger3 = new PowerRangerRosa(nomeRosa);
        ranger3.morfar();
        
        System.out.println("Digite o nome do Ranger Azul:\n");
        String nomeAzul = sc.nextLine();
        
        PowerRanger ranger4 = new PowerRangerAzul(nomeAzul);
        ranger4.morfar();
        
        System.out.println("Digite o nome do Ranger Amarelo:\n");
        String nomeAmarelo = sc.nextLine();
        
        PowerRanger ranger5 = new PowerRangerAmarelo(nomeAmarelo);
        ranger5.morfar();
        
        System.out.println("Digite o nome do Ranger Vermelho:\n");
        String nomeVermelho = sc.nextLine();
        
        PowerRanger ranger6 = new PowerRangerVermelho(nomeVermelho);
        ranger6.morfar();



        sc.close();
    }
    
}
