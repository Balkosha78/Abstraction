package bird;

public class Hawk extends Bird{
    public Hawk(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Ястреб Летает Быстро");

    }

    @Override
    public void makeSound() {
        System.out.println("Ястреб поёт: кьек-кьек-кьек...");

    }

    @Override
    public String birdInfo() {
        return "Эта птица может лететь с максимальной скоростью:  " + flySpeed;
    }
}
