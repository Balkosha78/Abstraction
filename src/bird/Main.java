package bird;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle(190);
        Bird hawk = new Hawk(200);
        eagle.fly();
        eagle.makeSound();
        System.out.println(eagle.birdInfo());
        System.out.println("______________________________________________________");
        hawk.fly();
        hawk.makeSound();
        System.out.println(hawk.birdInfo());
    }
}
