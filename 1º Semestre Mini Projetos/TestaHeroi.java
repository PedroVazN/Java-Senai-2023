public class TestaHeroi {

    public static void main(String[] args) {
        
        // Criação dos heróis

        heroi HomemDeFerro = new heroi();
        HomemDeFerro.nome ="Tony Stark";
        HomemDeFerro.altura = 1.85;
        HomemDeFerro.armadura = "MK-1";
        HomemDeFerro.idade = 53;
        HomemDeFerro.peso = 193;
        HomemDeFerro.poder = "Voar";
        HomemDeFerro.sexo = 'M';

        heroi Miranha = new heroi();
        Miranha.nome = "Peter Parker";
        Miranha.altura = 1.43;
        Miranha.armadura = "Iron Spider";
        Miranha.idade = 18;
        Miranha.peso = 77;
        Miranha.poder = "Lançar teia";
        Miranha.sexo = 'M';

        HomemDeFerro.correr();
        HomemDeFerro.falar();

        System.out.println(Miranha.nome +", é o nome do Miranha");
        System.out.println(HomemDeFerro.armadura);



    }
    
}