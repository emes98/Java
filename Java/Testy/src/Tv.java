public class Tv {
    private int cal;
    private String color;
    private String model;

    public Tv(int cal, String color, String model) {
        this.cal = cal;
        this.color = color;
        this.model = model;
    }

    public void getInformation() {
        System.out.println("Tv " + this.model + " has " + this.cal + " cal");
    }

}
