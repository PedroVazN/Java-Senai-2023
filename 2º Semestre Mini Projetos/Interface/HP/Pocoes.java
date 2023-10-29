package Interface.HP;

public class Pocoes {

    public static void main(String[] args) {
        
        LovePotion lovePotion = new LovePotion();
        InvisibilityPotion invisibilityPotion = new InvisibilityPotion();
        HealthPotion healthPotion = new HealthPotion();
        SpeedPotion speedPotion = new SpeedPotion();

        System.out.println("\n**************** Preparando Poções ****************\n");
        System.out.println("======= Preparando a poção do Amor: ======= \n");

        lovePotion.mix();
        lovePotion.heat();
        lovePotion.drink();

        System.out.println("\n======= Preparando a poção da Invisibilidade: ======= \n");

        invisibilityPotion.mix();
        invisibilityPotion.heat();
        invisibilityPotion.drink();

        System.out.println("\n======= Preparando a poção da Vida: ======= \n");

        healthPotion.mix();
        healthPotion.heat();
        healthPotion.drink();

        System.out.println("\n======= Preparando a poção da Velocidade: ======= \n");

        speedPotion.mix();
        speedPotion.heat();
        speedPotion.drink();

        System.out.println("\n **************************************************");

    }
}
