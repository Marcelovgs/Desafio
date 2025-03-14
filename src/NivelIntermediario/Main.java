package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto da classe NivelIntermediario.Uzumaki e aplicando herança
        Uzumaki Naruto = new Uzumaki("Naruto NivelIntermediario.Uzumaki", "Konoha", 27, RankNinja.KAGE);
        // Chamando métodos específicos da classe NivelIntermediario.Uzumaki
        Naruto.ModoSabio();
        Naruto.habilidadeEspecial();

        // Criando um objeto da classe NivelIntermediario.Uchiha e aplicando herança
        Uchiha Sasuke = new Uchiha("Sasuke", "Konoha", 17, RankNinja.JOUNNIN);
        Sasuke.habilidadeEspecial();

        // Criando um objeto da classe NivelIntermediario.Haruno
        Haruno Sakura = new Haruno("Sakura", "Konoha", 32, RankNinja.JOUNNIN);
        Sakura.AtivarCura();

        // Criando um objeto da classe NivelIntermediario.Hyuga
        Hyuga Hinata = new Hyuga("Hinata", "Konoha", 21, RankNinja.CHUUNIN);
        Hinata.Byakugan();

        // Criando um objeto da classe NivelIntermediario.Boruto que implementa uma interface
        Boruto Boruto = new Boruto("NivelIntermediario.Boruto", "Konoha", 6, RankNinja.GENIN);
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
        Boruto.ModoSabio();
    }
}