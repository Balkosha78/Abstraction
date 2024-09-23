package instrument;

public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument piano = new Piano();
        guitar.play();
        guitar.tune();
        piano.play();
        piano.tune();
    }
}