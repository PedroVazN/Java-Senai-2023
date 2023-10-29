package Interface.Flash.flashHeranca;

public class Flash_Heranca extends SuperHero2{

    public Flash_Heranca(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }

    public void runFast() {
        System.out.println(this.name + " está correndo");
    }

    public void savePeople() {
        System.out.println(this.name + " está salvando pessoas");
    }

    public void useSuperPower() {
        System.out.println(this.name + " Tem o SuperPoder de SuperVelocidade");
    }
   
}
