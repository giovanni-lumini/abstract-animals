public class Aquila extends Animale {

    // constructor
    public Aquila(String nome, int eta) {
        super(nome, eta);
    }

    // metodo normale (con corpo)
    public void dormi() {
        System.out.println("Zzz");
    };

    @Override
    public void verso() {
        System.out.println("verso dell'aquila");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia i conigli");
    }
}
