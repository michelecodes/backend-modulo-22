// Classe para representar um jogador
class Jogador {
    private String nome;
    private String tipoJogo;

    public Jogador(String nome, String tipoJogo) {
        this.nome = nome;
        this.tipoJogo = tipoJogo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }
}
