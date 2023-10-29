package Interface.Flash.flashHeranca;

public class Speedster_Heranca extends SuperHero2 {

    public Speedster_Heranca(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }

    public void runFast() {
        System.out.println(this.name + " está correndo  muito rapido");
    }

    public void savePeople() {
        System.out.println(this.name + " está salvando varias pessoas");
    }

    public void useSuperPower() {
        System.out.println(this.name + " Tem o SuperPoder de Dar aula de Java");
    }
   
    
}
