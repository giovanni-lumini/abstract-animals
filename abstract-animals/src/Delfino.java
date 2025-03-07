public class Delfino extends AbstractAnimale implements Nuota {

    // constructor
    public Delfino(String nome, int eta) {
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
        return "verso del delfino";
    }

    @Override
    public String mangia() {
        return "Il delfino mangia i pesci";
    }

    // interface methods
    @Override
    public String nuota() {
        return "Stò nuotando";
    }
}
