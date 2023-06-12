public class Parrot extends Animal implements Herbivore {
    private int dl_pior;

    @Override
    public void sound() {
        System.out.println("Kraaa");
    }

    public void abstractMethod() {
        System.out.println("Papugowa metoda abstrakcyjna");
    }

    public void eatPlant() {
        System.out.print("I eat 200g plants for a day");
    }

}
