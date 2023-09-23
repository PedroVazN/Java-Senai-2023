import java.util.Scanner;

public class palidromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        boolean ehPalindromo = true;
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                ehPalindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        if (ehPalindromo) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
        scanner.close();
    }
}
