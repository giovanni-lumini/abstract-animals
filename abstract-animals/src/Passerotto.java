public class Passerotto extends Animale {

    // constructor
    public Passerotto(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    // metodo normale (con corpo)
    public String dormi() {
        return "Zzz";
    };

    @Override
    public String verso() {
        return "Piu piu";
    }

    @Override
    public String mangia() {
        return "Il passerotto mangia i vermi";
    }
}
