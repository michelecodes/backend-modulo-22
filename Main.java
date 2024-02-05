import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Criar a lista principal de jogadores com seus tipos de jogo
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Player1", "Pokemon TCG"));
        jogadores.add(new Jogador("Player2", "Digimon TCG"));
        jogadores.add(new Jogador("Player3", "Magic the Gathering"));
        jogadores.add(new Jogador("Player4", "One Piece TCG"));
        jogadores.add(new Jogador("Player5", "Digimon TCG"));

        // Usar lambda para filtrar jogadores de Digimon TCG
        List<Jogador> jogadoresDigimon = jogadores.stream()
                .filter(jogador -> jogador.getTipoJogo().equals("Digimon TCG"))
                .collect(Collectors.toList());

        // Exibir os jogadores de Digimon TCG
        System.out.println("Jogadores de Digimon TCG:");
        jogadoresDigimon.forEach(jogador -> System.out.println(jogador.getNome()));
    }
}
