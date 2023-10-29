package starwars;

public class TestaWars {
    public static void main(String[] args) {
        StarWars lukeSkywalker = new Jedi("Luke Skywalker");
        StarWars darthVader = new Sith("Darth Vader");
        StarWars anakin = new Padawan("Anakin");

        lukeSkywalker.executarAcao(); // Executa a ação de um Jedi
        darthVader.executarAcao(); // Executa a ação de um Sith
        anakin.executarAcao(); // Executa a ação de um Padawan
    }
}