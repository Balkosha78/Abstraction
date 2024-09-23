package bird;

public abstract class Bird {
    public int flySpeed;

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract void fly();
    public abstract void makeSound();
    public String birdInfo(){
        return "Эта птица может лететь с максимальной скоростью:  ";
    }
}
