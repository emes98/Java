public class Cat extends Animal {

    protected String dl_fib;

    public Cat(String name, int size, String dl_fib) {
        super(name, size);
        this.dl_fib = dl_fib;

    }

    public void dl_fibrysow() {
        System.out.println("Długość fibrysów: " + this.dl_fib);
    }

}
