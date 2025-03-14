package NivelIntermediario;

// Classe base para todos os ninjas
class Ninja {
    String nome;
    String aldeia;
    int idade;
    RankNinja rank;

    // Construtor padrão
    public Ninja() {}

    // Construtor com parâmetros
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, RankNinja rank) {
        this(nome, aldeia, idade);
        this.rank = rank;
    }

    // Método sobrescrito para exibir habilidades do ninja
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque");
    }
}