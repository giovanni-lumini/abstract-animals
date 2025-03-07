//abstract class
public abstract class AbstractAnimale {

    // istances
    public String nome;
    public int eta;

    // constructor
    public AbstractAnimale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // metodo normale (con corpo)
    public String dormi() {
        return "Zzz";
    };

    // metodi abstract (senza corpo)
    public abstract String verso();

    public abstract String mangia();
}
