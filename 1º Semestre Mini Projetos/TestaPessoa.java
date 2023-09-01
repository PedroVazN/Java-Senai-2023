public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Jalin",           24, "Garoto de progama");
        Pessoa pessoa2 = new Pessoa("Cintia",          16, "estudante");
        Pessoa pessoa3 = new Pessoa("Charles lee ray", 31, "Assasino");
        Pessoa pessoa4 = new Pessoa("Tomy Oliver",     22, "Ranger verde");

        pessoa1.exibirInformacoes();
        System.out.println("");
        pessoa2.exibirInformacoes();
        System.out.println("");
        pessoa3.exibirInformacoes();
        System.out.println("");
        pessoa4.exibirInformacoes();
    }
    
}
