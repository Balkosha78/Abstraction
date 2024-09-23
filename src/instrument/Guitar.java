package instrument;

public class Guitar extends Instrument{
    @Override
    public void play() {
        System.out.println("Играет Гитара");

    }

    @Override
    public void tune() {
        System.out.println("Идет настройка Гитары");

    }
}
