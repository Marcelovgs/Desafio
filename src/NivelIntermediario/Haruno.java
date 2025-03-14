package NivelIntermediario;

// Classe Haruno que herda de Ninja
class Haruno extends Ninja {
    public Haruno(String nome, String aldeia, int idade, RankNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    public void AtivarCura() {
        System.out.println(nome + " Ativou a Cura");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque de cura");
    }
}
