package trabalho;

public class Pedido {
    
    public String nome = null;
    public int numero = 0;

    public  Pedido(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public  String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}

 