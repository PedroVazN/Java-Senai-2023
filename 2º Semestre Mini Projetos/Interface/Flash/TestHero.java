package Interface.Flash;

public class TestHero {

    public static void main(String[] args) {

        Flash flash = new Flash();
        Speedster flashReverso = new Speedster();

        
        System.out.println("\n**************** VELOCISTAS ****************\n");
        System.out.println("======= Flash o super-héroi da velocidade ======= \n");

        flash.runFast();
        flash.savePeople();
        flash.useSuperPower();

        System.out.println("\n======= Flash reverso ======= \n");

        flashReverso.runFast();
        flashReverso.savePeople();
        flashReverso.useSuperPower();

        System.out.println("\n********************************************");

    }
    
}
