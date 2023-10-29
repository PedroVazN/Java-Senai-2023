// Classes Abstractas --> São Classes que servem de modelo para outras classes
// NAO PODEM SER INSTACIADAS
// Palavra chave: ABSTRACT

package starwars;

//Classe Abstrata --> Modelo
abstract class StarWars {

    String nome;

    public StarWars(String nome) {
        this.nome = nome;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void executarAcao();

}

class Jedi extends StarWars {

    public Jedi(String nome) {
        super(nome);
    }

    @Override // Polimorfismo
    public void executarAcao() {
        System.out.println(nome + " usa a Força para o lado da Luz.");

    }

}

class Padawan extends StarWars {
    public Padawan(String nome) {
        super(nome);
    }

    @Override // Polimorfismo
    public void executarAcao() {
        System.out.println(nome + " treina para usar a força");

    }
}

class Sith extends StarWars {

    public Sith(String nome) {
        super(nome);
    }

    @Override // Polimorfismo
    public void executarAcao() {
        System.out.println(nome + " usa a Força para o lado do Mal");

    }
}
