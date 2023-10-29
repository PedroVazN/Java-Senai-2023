package desenhos;
class SuperChoque extends Desenho implements Skills {

    public SuperChoque(String nome, String raca, int idade, String nacionalidade) {
        super(nome, raca, idade, nacionalidade);
    }

    @Override
    public void Hability1() {
        System.out.println(this.nome + " Ativou a Habilidade:");
        System.out.println("Choque!\n");
    }

    @Override
    public void Hability2() {
        System.out.println(this.nome + " Ativou a Habilidade:");
        System.out.println("Voar com tampa de boero!\n");

    }
    
    @Override
    public void Hability3() {
        System.out.println(this.nome + " Ativou a Habilidade:");
        System.out.println("Descarga elétrica!\n");

    }
}

class Pablo extends Desenho implements Skills {

    public Pablo(String nome, String raca, int idade, String nacionalidade) {
        super(nome, raca, idade, nacionalidade);
    }

    @Override
    public void Hability1() {
        System.out.println("Habilidade 1 Ativada");
        System.out.println("Velejar em alto mar\n");
    }

    @Override
    public void Hability2() {
        System.out.println(this.nome + " Ativou a Habilidade:");
        System.out.println("Raquetada super poderosa\n");

    }

    @Override
    public void Hability3() {
        System.out.println(this.nome + " Ativou a Habilidade:");
        System.out.println("Adstrador de Ominhoco\n");

    }

}

class Luffy extends Desenho implements Skills {

    public Luffy(String nome, String raca, int idade, String nacionalidade) {
        super(nome, raca, idade, nacionalidade);
    }

    @Override
    public void Hability1() {
        System.out.println("Habilidade 1 Ativada");
        System.out.println("GOMU GOMU NO GATLING\n");
    }

    @Override
    public void Hability2() {
        System.out.println(this.nome + " Ativou a Habilidade:");
        System.out.println("GOMU GOMU NO PISTOL\n");

    }

    @Override
    public void Hability3() {
        System.out.println(this.nome + " Ativou a Habilidade:");
        System.out.println("GOMU GOMU NO BALLOON\n");

    }

}
