public class Dog extends Animal implements Carnivore, Herbivore {

    @Override
    public void sound() {
        super.sound();
        System.out.println("Woof");
    }

    public void abstractMethod() {
        System.out.println("Metoda abstrakcyjna- Pies");
    }

    public void eatPlant() {
        System.out.println("I eat only 30g plants for a day");
    }

    public void eatMeat() {
        System.out.println("I eat 100g of meat for a day- much more than plants!");
    }

}