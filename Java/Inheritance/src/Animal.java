public class Animal {

    protected String name;
    protected int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void speak() {
        System.out.println("...");
    }

    public void tellName() {
        System.out.println("Name: " + this.name);
    }

    public void whatSize() {
        System.out.println("Size: " + this.size);
    }

}
