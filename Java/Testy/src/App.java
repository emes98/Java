import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Dog d1 = new Dog("Bubel", 2, "black");

        d1.tellMeIfHungry();

        d1.aport(200);

        d1.aport(10);
        d1.aport(10);
        d1.aport(10);
        d1.aport(10);
        d1.aport(10);

        d1.tellMeIfHungry();

        Food f1 = new Food(1000, "meat");
        Food f2 = new Food(0, "water");

        d1.feed(f1);

        d1.tellMeIfHungry();

        Tv lg = new Tv(40, "silver", "lg-500");

        lg.getInformation();

        Cat cat1 = new Cat();
        cat1.speak();

    }

}
