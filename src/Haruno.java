public class Haruno extends Ninja{


    public Haruno(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Haruno(String nome, String aldeia, int idade, RankNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    public void AtivarCura() {
        System.out.println(nome + " Ativou a Cura");

    }
}
