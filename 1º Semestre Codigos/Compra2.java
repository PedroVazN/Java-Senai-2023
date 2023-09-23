import java.util.Scanner;

public class Compra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double menorCompra = Double.MAX_VALUE;
        double maiorCompra = Double.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {

            System.out.printf("Informe o valor da %dª compra: ", i);
            double valorCompra = scanner.nextDouble();
            soma += valorCompra;

            if (valorCompra < menorCompra) {
                menorCompra = valorCompra;
            }

            if (valorCompra > maiorCompra) { 

                
                maiorCompra = valorCompra;
            }
        }

        double media = soma / 10;
        double diferenca = maiorCompra - menorCompra;

        System.out.printf("Média das compras: R$ %.2f\n", media);
        System.out.printf("Menor compra: R$ %.2f\n", menorCompra);
        System.out.printf("Maior compra: R$ %.2f\n", maiorCompra);
        System.out.printf("Diferença entre a maior e a menor compra: R$ %.2f\n", diferenca);

        scanner.close();
    }
}
