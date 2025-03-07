public class Aquila extends Animale implements Vola {

    // constructor
    public Aquila(String nome, int eta) {
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
        return "verso dell'aquila";
    }

    @Override
    public String mangia() {
        return "L'aquila mangia i conigli";
    }

    // interface methods
    @Override
    public String vola() {
        return "Stò volando";
    }
}
