public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        dog1.name = "Szarik";
        dog1.size = 22;
        dog1.eatPlant();
        dog1.eatMeat();

        dog1.sound();
        dog1.abstractMethod();
        System.out.println("");

        Parrot parrot1 = new Parrot();
        parrot1.abstractMethod();
        parrot1.eatPlant();

        System.out.println("");
        System.out.println("");

        Cat cat1 = new Cat();
        cat1.abstractMethod();
        cat1.eatMeat();
    }
}
