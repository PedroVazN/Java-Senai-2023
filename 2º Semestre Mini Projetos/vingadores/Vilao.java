package vingadores;

public class Vilao extends Vingadores {

    public Vilao(String nome, String armadura, double altura, int idade, String habilidade, boolean extraterreste) {
        super(nome, armadura, altura, idade, habilidade, extraterreste);
    }

    public void atirar(){
        System.out.println("Laser");
    }

}
