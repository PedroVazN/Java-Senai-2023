package Interface.HP;

//Interface Poção
interface Potion {
    void mix(); // Um método para misturar as poções

    void heat(); // Um método para aquecer as poções

    void drink(); // Um método para beber as poções
}

class LovePotion implements Potion {

    @Override
    public void mix() {
        System.out.println("Misturando os ingredientes da poção do amor");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção no caldeirão com um toque de paição");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa que bebeu a poção se APAIXONA APROFUNDAMENTE");
    }

}

class InvisibilityPotion implements Potion {

    @Override
    public void mix() {
        System.out.println("Misturando os ingredientes da poção da invisibilidade");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção da invisibilidade");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa que bebeu a poção da invisibilidade fica invísivel");
    }
}

class HealthPotion implements Potion {

    @Override
    public void mix() {
        System.out.println("Misturando os ingredientes da poção da vida");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção da vida");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa bebeu a poção da vida");
    }
}

class SpeedPotion implements Potion {
    
    @Override
    public void mix() {
        System.out.println("Misturando os ingredientes da poção da velocidade");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção da velocidade");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa bebeu a poção da velocidade");
    }
}