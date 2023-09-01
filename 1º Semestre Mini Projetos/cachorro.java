class Cachorro {

    int tamanho;
    String nome;

    public void latir() {
        if (tamanho > 60) {
            System.out.println("Woof, Woof !!");
        } else if (tamanho > 14) {
            System.out.println("Ruff!, Ruff!");
        } else {
            System.out.println("Yip!, Yip");
        }
    }
}
