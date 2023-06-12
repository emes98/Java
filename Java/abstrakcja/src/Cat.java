public class Cat extends Animal implements Carnivore {

    @Override
    public void sound() {
        System.out.println("Miau");
    }

    public void abstractMethod() {
        System.out.println("Metoda abstrakcyjna- kot");
    }

    public void eatMeat() {
        System.out.print("I eat 300g meat per day");
    }

}
