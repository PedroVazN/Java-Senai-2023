package produto;
public class TestaProduto {

    public static void main(String[] args) {

        produto p1 = new produto();
        produto p2 = new produto();
        produto p3 = new produto();

        p1.setNome("DIAMANTES\n");
        p1.setPreco(100);
        p1.setQuantidadeEmEstoque(10);

        p2.setNome("VBUCKS\n");
        p2.setPreco(200);
        p2.setQuantidadeEmEstoque(20);

        p3.setNome("ROBUX\n");
        p3.setPreco(300);
        p3.setQuantidadeEmEstoque(30);

        System.out.println(p1.getNome() + " \nPreço: " + p1.getPreco() + " \nEstoque: " + p1.getQuantidadeEmEstoque() + " \nTotal: " + p1.setCalcularTotal() + ".\n");
        System.out.println(p2.getNome() + " \nPreço: " + p2.getPreco() + " \nEstoque: " + p2.getQuantidadeEmEstoque() + " \nTotal: " + p2.setCalcularTotal() + ".\n");
        System.out.println(p3.getNome() + " \nPreço: " + p3.getPreco() + " \nEstoque: " + p3.getQuantidadeEmEstoque() + " \nTotal: " + p3.setCalcularTotal() + ".\n");

        

    }
    
}
