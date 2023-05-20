import java.util.Random;

class Food {

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

class Dog {

    private static int MAX_HUNGER = 10;

    private String name;
    private int age;
    private String color;
    private int hunger; // 0-10, gdzie 0 to głodny a 10 najedzony

    public Dog(String x, int y, String z) {
        this.name = x;
        this.age = y;
        this.color = z;
        this.hunger = Dog.MAX_HUNGER; // Każdy nowy pies jest najedzony
    }

    public void printDogInfo() {
        System.out.println("My name is: " + this.name);
        System.out.println("My age is: " + this.age);
        System.out.println("My color is: " + this.color);
        System.out.println("My hunger level is: " + this.hunger);
    }

    public boolean isHungry() {
        return this.hunger <= 0;
    }

    public void tellMeIfHungry() {
        if (this.isHungry()) {
            System.out.println("I am hungry :( ");
        } else {
            System.out.println("I am not hungry :) ");
        }
    }

    public void aport(int distance) {
        if (distance > 0 && distance <= 20) {
            tryToAport(2);
        } else if (distance > 20 && distance <= 100) {
            tryToAport(7);
        } else {
            System.out.println("The distance is too big :O ");
        }
    }

    private void tryToAport(int requiredHunger) {
        if (this.hunger >= requiredHunger) {
            System.out.println("Aport!");
            this.hunger -= requiredHunger;
        } else {
            System.out.println("I am too hungry to run :( ");
        }
    }

    // 1 hunger point equals 100 kcal

    public void feed(Food product) {
        int missingHungerPoints = Dog.MAX_HUNGER - this.hunger;
        int missingKcal = missingHungerPoints * 100;

        int caloriesEaten = 0;

        while (caloriesEaten < missingKcal && product.isAnythingLeftToEat()) {
            int kcalBite = product.bite();
            caloriesEaten += kcalBite;
        }

        this.hunger += caloriesEaten / 100;

    }

}

public class App {
    public static void main(String[] args) throws Exception {

        Dog d1 = new Dog("Bubel", 2, "black");

        d1.tellMeIfHungry();

        d1.aport(200);

        d1.aport(10);
        d1.aport(10);
        d1.aport(10);
        d1.aport(10);
        d1.aport(10);

        d1.tellMeIfHungry();

        Food f1 = new Food(1000, "meat");
        Food f2 = new Food(0, "water");

        d1.feed(f2);

        d1.tellMeIfHungry();

    }

}
