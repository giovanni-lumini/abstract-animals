public class Passerotto extends Animale implements Vola {

    // constructor
    public Passerotto(String nome, int eta) {
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
        return "Piu piu";
    }

    @Override
    public String mangia() {
        return "Il passerotto mangia i vermi";
    }

    // interface methods
    @Override
    public String vola() {
        return "Stò volando";
    }
}
