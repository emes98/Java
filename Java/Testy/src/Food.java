import java.util.Random;

public class Food {

    private int kcal;
    private String name;
    private Random random;

    public Food(int kcal, String name) {
        this.kcal = kcal;
        this.name = name;

        this.random = new Random();
    }

    public int bite() {

        int number = this.random.nextInt(51) + 50;

        if (number <= this.kcal) {
            this.kcal -= number;
            return number;
        }

        else {

            int kcalBeforeBite = this.kcal;
            this.kcal = 0;
            return kcalBeforeBite;

        }
    }

    public boolean isAnythingLeftToEat() {
        return this.kcal > 0;
    }
}
