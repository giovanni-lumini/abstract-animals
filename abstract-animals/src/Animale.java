//abstract class
public abstract class Animale {

    // istances
    public String nome;
    public int eta;

    // constructor
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // metodo normale (con corpo)
    public void dormi() {
        System.out.println("Zzz");
    };

    // metodi abstract (senza corpo)
    public abstract void verso();

    public abstract void mangia();

}
