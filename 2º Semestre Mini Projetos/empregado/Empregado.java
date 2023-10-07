package empregado;

public class Empregado {
    private String nome;
    private String cargo;
    private int tempoDeCasa;
    private String empresa = "SENAI";

    //Método construtor
    public Empregado(String nome, String cargo, int tempoDeCasa) {
        this.nome = nome;
        this.cargo = cargo;
        this.tempoDeCasa = tempoDeCasa;

    }
    //Métodos getter
    public String getNome() {
        return nome;

    }
    public String getCargo() {
        return cargo;
    }
    public int getTempoDeCasa() {
        return tempoDeCasa;
    }
    public String getEmpresa() {
        return empresa;
    }
    //Métodos setter
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
