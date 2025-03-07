public class Main {

    // SOL 1: interface Vola and animale,
    // can be passed as parameters
    // methods from the interface class
    static String faiVolare(Vola animaleVolante) {
        return animaleVolante.vola();
    }

    // methods from the interface class
    static String faiNuotare(Nuota animaleNuotante) {
        return animaleNuotante.nuota();
    }

    public static void main(String[] args) {

        Cane caneBobby = new Cane("Bobby", 3);
        Passerotto passerottoMinnie = new Passerotto("Minnie", 5);
        Delfino delfinoNemo = new Delfino("Nemo", 2);
        Aquila aquilaPippo = new Aquila("Pippo", 4);

        // from the ABSTRACT class
        System.out.println("Cane mentre dorme: " + caneBobby.dormi());
        System.out.println("Verso del passerotto: " + passerottoMinnie.verso());
        System.out.println("Cosa mangia il delfino? " + delfinoNemo.mangia());
        System.out.println("Aquila mentre dorme: " + aquilaPippo.dormi());

        // from the INTERFACE class
        // SOL 1
        System.out.println("Delfino mentre nuota: " + faiNuotare(delfinoNemo));
        System.out.println("Passerotto mentre vola: " + faiVolare(passerottoMinnie));
        System.out.println("Aquila mentre vola: " + faiVolare(aquilaPippo));

        // SOL 2
        System.out.println("Delfino mentre nuota: " + delfinoNemo.nuota());
        System.out.println("Passerotto mentre vola: " + passerottoMinnie.vola());
        System.out.println("Aquila mentre vola: " + aquilaPippo.vola());

    }
}
