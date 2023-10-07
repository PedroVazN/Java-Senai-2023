package empregado;

public class Reestruturacao {
    public static void main(String[] args) {

        //Empregado promovido;
        //Promocao promocao = new Promocao();

        Empregado e1 = new Empregado("Bruno", "artista", 9);
        Empregado e2 = new Empregado("Maria", "programador", 6);
        Empregado e3 = new Empregado("GulhermeSoares", "prostituto", -10);
        Empregado e4 = new Empregado("Heloisa", "padera",17 );

        //promovido = promocao.promocao(e1, e2, e3, e4);

        //System.out.println(promovido.getEmpresa());
        System.out.println(e1.getEmpresa());
        System.out.println(e2.getEmpresa());
        System.out.println(e3.getEmpresa());
        System.out.println(e4.getEmpresa());

        e2.setEmpresa("fiesp");

    }
}
