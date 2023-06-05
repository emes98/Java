public class Dog extends Animal {

    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public void speak() {
        System.out.println("Dog woof");
    }

}
