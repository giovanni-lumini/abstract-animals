public class Aquila extends Animale {

    // constructor
    public Aquila(String nome, int eta) {
        super(nome, eta);
    }

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
}
