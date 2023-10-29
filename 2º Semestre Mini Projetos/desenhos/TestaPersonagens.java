package desenhos;
public class TestaPersonagens{

    public static void main(String[] args) {

        SuperChoque superChoque = new SuperChoque("Phill Lamar", "Humano", 15, "Americano");
        Luffy luffy = new Luffy("Monkey D. Luffy", "Humano", 17, "Brasileiro");
        Pablo pablo = new Pablo("Pablo", "Animal", 7, "Antarctica");

        System.out.println("\n**************** PERSONAGENS ****************\n");
        System.out.println("======= SUPER CHOQUIIIII!! ======= \n");

        superChoque.Hability1();
        superChoque.Hability2();
        superChoque.Hability3();

        System.out.println("======= LUFFY DO CHAPEU DI PALHA ======= \n");

        luffy.Hability1();
        luffy.Hability2();
        luffy.Hability3();

        System.out.println("======= PABLO DO VELHO OESTE ======= \n");

        pablo.Hability1();
        pablo.Hability2();
        pablo.Hability3();

    }
}