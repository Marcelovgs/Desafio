public class Uzumaki extends Ninja {

    public void ModoSabio() {
        System.out.println(nome + " ativou o modo sábio");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de vento e eu sou nivel " + rank);
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, RankNinja rank) {
        super(nome, aldeia, idade, rank);
    }
}
