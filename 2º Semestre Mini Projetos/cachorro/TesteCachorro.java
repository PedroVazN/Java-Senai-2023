package cachorro;
public class TesteCachorro {
    public static void main(String[] args) {
        
            cachorro mike = new cachorro(50, 1, "AIII AIII");
            cachorro tiquetique = new cachorro(50, 1, "AU AU EU SOU UM CACHORRAO");
            cachorro tiqueuique = new cachorro();

            System.out.println(mike.getLatido());
            System.out.println(tiquetique.getLatido());
            System.out.println(tiqueuique.getLatido());
    }
}
