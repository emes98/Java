import java.util.Random;

public class Dog {

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