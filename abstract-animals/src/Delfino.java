public class Delfino extends Animale {

    // constructor
    public Delfino(String nome, int eta) {
        super(nome, eta);
    }

    // metodo normale (con corpo)
    public void dormi() {
        System.out.println("Zzz");
    };

    @Override
    public void verso() {
        System.out.println("verso del delfino");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia i pesci");
    }
}
