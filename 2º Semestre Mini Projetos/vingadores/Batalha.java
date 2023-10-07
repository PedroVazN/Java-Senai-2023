package vingadores;

public class Batalha {

    public static void main(String[] args) {
        
        Vingadores ving = new Vingadores("Nobru", "Capa 2", 1.80, 40, "Subir capa", false);
        ving.atirar();

        Vilao vilao = new Vilao("Coringa", "Colete2", 1.620, 25, "ababa", false);
        vilao.atirar();
    }
    
}
