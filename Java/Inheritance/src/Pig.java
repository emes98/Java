public class Pig extends Animal {

    public Pig(String name, int size) {
        super(name, size);
    }

    @Override
    public void speak() {
        System.out.println("Pig chrum");
    }

    @Override
    public void tellName() {
        System.out.println("My name is: " + this.name);
    }

}
