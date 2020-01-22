package lab2.animalrescue;

public class Animal {
    private String name;
    private int age;
    private static int healthCondition;
    private static int levelOfHunger;
    private static int mood;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHealthCondition(int healthCondition) {
        this.healthCondition = healthCondition; }

    public int getHealthCondition() {
        return healthCondition;
    }

    public int setLevelOfHunger(int levelOfHunger) {
        this.levelOfHunger = levelOfHunger;
        return levelOfHunger;
    }

    public int getLevelOfHunger() {
        return levelOfHunger;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public static void validate (Animal dog) {
        // check if the value is within range
        if (dog.healthCondition < 1 || dog.healthCondition > 10) {
            throw new IllegalArgumentException("The value is outside the accepted range.");
        }
        if (dog.levelOfHunger < 1 || dog.levelOfHunger > 10) {
            throw new IllegalArgumentException("The value is outside the accepted range.");
        }
        if (dog.mood < 1 || dog.mood > 10){
            throw new IllegalArgumentException("The value is outside the accepted range.");
        }
        else {
            System.out.println("The dog's health condition is: " + dog.healthCondition);
            System.out.println("The dog's level of hunger is: " + dog.levelOfHunger);
            System.out.println("The dog's mood is: " + dog.mood);
        }
    }

}