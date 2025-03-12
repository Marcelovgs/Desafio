// Classe Hyuga que herda de Ninja
class Hyuga extends Ninja {
    public Hyuga(String nome, String aldeia, int idade)
    { super(nome, aldeia, idade); }

    public Hyuga(String nome, String aldeia, int idade, RankNinja rank)
    { super(nome, aldeia, idade, rank); }

    public void Byakugan() {
        System.out.println(nome + " Ativou o Byakugan");
    }
}