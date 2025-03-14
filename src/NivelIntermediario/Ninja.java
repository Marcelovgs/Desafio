package NivelIntermediario;

// Classe abstrata base para todos os ninjas
abstract class Ninja {
    String nome;
    String aldeia;
    int idade;
    RankNinja rank;

    // Construtor com parâmetros
    public Ninja(String nome, String aldeia, int idade, RankNinja rank) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.rank = rank;
    }

    // Método abstrato para habilidade especial
    public abstract void habilidadeEspecial();
}
