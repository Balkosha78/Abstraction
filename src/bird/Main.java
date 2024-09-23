package bird;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle(190);
        Bird hawk = new Hawk(200);
        System.out.println(eagle.birdInfo());
        eagle.fly();
        eagle.makeSound();
        System.out.println(hawk.birdInfo());
        hawk.fly();
        hawk.makeSound();
    }
}
