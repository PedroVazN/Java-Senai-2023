package banco;
public class TestaBanco {

    public static void main(String[] args) {

        banco SenaiBank = new banco(10000.0, "pedro 33cm");
        SenaiBank.exibirInformações();
        SenaiBank.depositar(500);
        System.out.println(SenaiBank.consultarSaldo());
    }
}
