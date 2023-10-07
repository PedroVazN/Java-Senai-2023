package vingadores;

public class Vingadores {
    String armadura;
    String nome;
    double altura;
    int idade;
    String habilidades;
    boolean extraterreste;

    public Vingadores (String nome, String armadura, double altura, int idade, String habilidades, boolean extraterreste){
        this.nome = nome;
        this.armadura = armadura;
        this.altura = altura;
        this.idade = idade;
        this.habilidades = habilidades;
        this.extraterreste = extraterreste;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getArmadura() {
        return armadura;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getHabilidades() {
        return habilidades;
    }
    
    public boolean getExtraterreste() {
        return extraterreste;
    }

    public void atirar(){
        System.out.println("Agua");
    }


    
}
