public class Cane extends AbstractAnimale {

    // constructor
    public Cane(String nome, int eta) {
        super(nome, eta);
    }

    // abstract methods
    @Override
    // metodo normale (con corpo)
    public String dormi() {
        return "Zzz";
    };

    @Override
    public String verso() {
        return "Bau bau";
    }

    @Override
    public String mangia() {
        return "Il cane mangia le crocchette";
    }
}
