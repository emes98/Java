public class App {
    public static void main(String[] args) throws Exception {

        Dog d1 = new Dog("Szarik", 55);
        Dog d2 = new Dog("Bubek", 22);
        Husky h1 = new Husky("Akita", 60);
        Samoyed s1 = new Samoyed("Sam", 50);
        Cat c1 = new Cat("Lucynka", 20, "30");
        Pig p1 = new Pig("George", 100);

        Animal[] allAnimals = { d1, d2, h1, s1, c1, p1 };

        for (Animal i : allAnimals) {

            i.tellName();
            i.whatSize();
            i.speak();

            System.out.println("");
        }

        c1.dl_fibrysow();
    }

}
