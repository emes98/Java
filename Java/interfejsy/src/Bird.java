public class Bird extends Animal implements Flyable {

    @Override
    public void swim() {
        System.out.println("I cannot swim");
    }

    @Override
    public void fly() {
        System.out.println("Fruu");
    }

}
