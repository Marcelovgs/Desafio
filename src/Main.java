public class Main {
    public static void main(String[] args) {

        // Criar ninja Naruto Uzumaki obj 1
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 27, RankNinja.KAGE);
        //Aplicando metodos aos objetos
        Naruto.ModoSabio();
        Naruto.habilidadeEspecial();

        // Criar ninja sasuke uchiha obj 2
        Uchiha Sasuke = new Uchiha( "Sasuke", "Konoha", 17, RankNinja.JOUNNIN);
        //Aplicando metodos aos objetos
        Sasuke.habilidadeEspecial();

        // Criar ninja Sakura Haruno obj 3
        Haruno Sakura = new Haruno("Sakura", "Konoha", 32, RankNinja.JOUNNIN);
        Sakura.AtivarCura();

        //Criar ninja Hinata Hyuga obj4
        Hyuga Hinata = new Hyuga("Hinata", "Konoha", 21, RankNinja.CHUUNIN);
        Hinata.Byakugan();

        Boruto Boruto = new Boruto("Boruto", "Konoha", 6, RankNinja.GENIN);

        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
        Boruto.ModoSabio();
    }
}
