public class Main {
    public static void main(String[] args) {

        Cane caneBobby = new Cane("Bobby", 3);
        Passerotto passerottoMinnie = new Passerotto("Minnie", 5);
        Delfino delfinoNemo = new Delfino("Nemo", 2);
        Aquila aquilaPippo = new Aquila("Pippo", 4);

        System.out.println("Cane mentre dorme: " + caneBobby.dormi());
        System.out.println("Verso del passerotto: " + passerottoMinnie.verso());
        System.out.println("Cosa mangia il delfino? " + delfinoNemo.mangia());
        System.out.println("Aquila mentre dorme: " + aquilaPippo.dormi());
    }
}
