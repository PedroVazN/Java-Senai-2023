package desenhos;
abstract class Desenho {

    String nome;
    String raca;
    int idade;
    String nacionalidade;

    public Desenho(String nome, String raca, int idade, String nacionalidade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
   
}

interface Skills {

    void Hability1();

    void Hability2();

    void Hability3();

}

