public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
            super(nome, aldeia, idade);
    }

        @Override
        public void habilidadeEspecial() {
            System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de vento e eu sou " +
                    "nivel: " + rank);
        }

    public Uchiha(String nome, String aldeia, int idade, RankNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    }

