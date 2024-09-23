package instrument;

public class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("Играет Фортепиано");

    }

    @Override
    public void tune() {
        System.out.println("Идет настройка Фортепиано");

    }
}
