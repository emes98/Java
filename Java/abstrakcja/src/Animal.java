import javax.lang.model.element.Name;

abstract class Animal {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void sound() {
        System.out.print("");
    }

    public abstract void abstractMethod();

}
