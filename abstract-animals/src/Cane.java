public class Cane extends Animale {

    // constructor
    public Cane(String nome, int eta) {
        super(nome, eta);
    }

    // metodo normale (con corpo)
    public void dormi() {
        System.out.println("Zzz");
    };

    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia le crocchette");
    }

}
