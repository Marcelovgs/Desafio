import NivelIntermediario.OverloadSobrecarga.NivelNinja;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    RankNinja rank;

    

    // Construtor com argumentos
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, RankNinja rank) {
        this(nome, aldeia, idade);
        this.rank = rank;
    }


    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque");
    }

}
