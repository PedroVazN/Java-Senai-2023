package Interface.Flash;

// Interface Super Heroi

interface SuperHero {

    void runFast();

    void savePeople();

    void useSuperPower();

}

// Classe Flash

class Flash implements SuperHero {

    @Override
    public void runFast() {
        System.out.println("Flash está correndo em velocidade máxima");
    }

    @Override
    public void savePeople() {
        System.out.println("Flash está salvando pessoas!");
    }

    @Override
    public void useSuperPower() {
        System.out.println("Super Velocidade");
    }

}

class Speedster implements SuperHero {

    @Override
    public void runFast() {
        System.out.println("Speedtster também está em uma velocidade muito rápida!");
    }

    @Override
    public void savePeople() {
        System.out.println("Speedtster está salvando vidas com sua velocidade!");
    }

    @Override
    public void useSuperPower() {
        System.out.println("Speedtster está usando sua velocidade");
    }
}
