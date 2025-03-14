package NivelIntermediario;

// Classe Hyuga que herda de Ninja
class Hyuga extends Ninja {
    public Hyuga(String nome, String aldeia, int idade, RankNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    public void Byakugan() {
        System.out.println(nome + " Ativou o Byakugan");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Byakugan");
    }
}
