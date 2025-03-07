public class Passerotto extends Animale {

    // constructor
    public Passerotto(String nome, int eta) {
        super(nome, eta);
    }

    // metodo normale (con corpo)
    public void dormi() {
        System.out.println("Zzz");
    };

    @Override
    public void verso() {
        System.out.println("Piu piu");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia i lombrichi");
    }

}
