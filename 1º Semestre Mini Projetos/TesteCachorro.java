public class TesteCachorro {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.tamanho = 70;
        Cachorro cachorro2 = new Cachorro();
        cachorro2.tamanho = 20;
        Cachorro cachorro3 = new Cachorro();
        cachorro3.tamanho = 10;

        System.out.println("Cachorro 1:");
        cachorro1.latir();

        System.out.println("\nCachorro 2:");
        cachorro2.latir();

        System.out.println("\nCachorro 3:");
        cachorro3.latir();
    }
}