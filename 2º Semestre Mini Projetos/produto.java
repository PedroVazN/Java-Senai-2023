public class produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double setCalcularTotal(){
        this.preco = this.preco * this.quantidadeEmEstoque;
        return this.preco;
    }

    

}