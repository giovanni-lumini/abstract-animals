public class Delfino extends Animale {

    // constructor
    public Delfino(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    // metodo normale (con corpo)
    public String dormi() {
        return "Zzz";
    };

    @Override
    public String verso() {
        return "verso del delfino";
    }

    @Override
    public String mangia() {
        return "Il delfino mangia i pesci";
    }
}
