// Classe Boruto que herda de Uzumaki e implementa uma interface
class Boruto extends Uzumaki implements HyugaUzumaki {
    public Boruto(String nome, String aldeia, int idade) { super(nome, aldeia, idade); }
    public Boruto(String nome, String aldeia, int idade, RankNinja rank) { super(nome, aldeia, idade, rank); }

    public void AtivarKarma() {
        System.out.println(nome + " Ativou o Karma, eu sou um Hyuga Uzumaki");
    }

    public void AtivarJougan() {
        System.out.println(nome + " Ativou o Jougan, eu sou um Hyuga Uzumaki");
    }
}



