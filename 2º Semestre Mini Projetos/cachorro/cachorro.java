package cachorro;
public class cachorro {

    private double peso;
    private int idade;
    private String latido;

    public cachorro() {
        peso = 6;
        idade = 6;
        latido = "Au!";
    }

    public cachorro(double peso, int idade) {
        this.peso = peso;
        this.idade = idade;
    }
    public cachorro(double peso, int idade, String latido) {
        this.peso = peso;
        this.idade = idade;
        this.latido = latido;
    }
    
    public double getPeso() {
        return peso;
    }
    public String getLatido() {
        return latido;
    }
    public int idade() {
        return idade;
    }


}
