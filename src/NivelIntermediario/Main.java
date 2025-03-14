package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto da classe Uzumaki e aplicando herança
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 27, RankNinja.KAGE);
        // Chamando métodos específicos da classe Uzumaki
        Naruto.ModoSabio();
        Naruto.habilidadeEspecial();

        // Criando um objeto da classe Uchiha e aplicando herança
        Uchiha Sasuke = new Uchiha("Sasuke", "Konoha", 17, RankNinja.JOUNNIN);
        Sasuke.habilidadeEspecial();

        // Criando um objeto da classe Haruno
        Haruno Sakura = new Haruno("Sakura", "Konoha", 32, RankNinja.JOUNNIN);
        Sakura.AtivarCura();

        // Criando um objeto da classe Hyuga
        Hyuga Hinata = new Hyuga("Hinata", "Konoha", 21, RankNinja.CHUUNIN);
        Hinata.Byakugan();

        // Criando um objeto da classe Boruto que implementa a interface HyugaUzumaki
        Boruto Boruto = new Boruto("Boruto Uzumaki", "Konoha", 6, RankNinja.GENIN);
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
        Boruto.ModoSabio();
    }
}
