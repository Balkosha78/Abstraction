package bird;

public class Eagle extends Bird{
    public Eagle(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Орёл летает высоко");

    }

    @Override
    public void makeSound() {
        System.out.println("Орел голосит клекотом или орлиным криком");

    }

    @Override
    public String birdInfo() {
        return "Орел может лететь с максимальной скоростью:  " + flySpeed;
    }
}
