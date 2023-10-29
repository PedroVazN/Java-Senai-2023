package Interface.Flash.flashHeranca;

class TestaHeranca{
    public static void main(String[] args) {

        SuperHero2 flash = new Flash_Heranca("Berry Alen", 25, "Pika das galaxias");
        SuperHero2 gusgus = new Speedster_Heranca("Gustavo", 18, "Melhor Professor de java");

        System.out.println("\n**************** VELOCISTAS ****************\n");
        System.out.println("======= Flash o super-héroi da velocidade ======= \n");

        flash.runFast();
        flash.savePeople();
        flash.useSuperPower();

        System.out.println("\n======= Gustavo ======= \n");

        gusgus.runFast();
        gusgus.savePeople();
        gusgus.useSuperPower();

        System.out.println("\n********************************************");



    }
}
