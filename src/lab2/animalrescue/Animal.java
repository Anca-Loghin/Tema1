package lab2.animalrescue;

public class Animal {
    private String name;
    private int age;
    private int healthCondition;
    private int levelOfHunger;
    private int mood;



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
        this.healthCondition = healthCondition;
    }

    public int getHealthCondition() {
        return getHealthCondition();
    }

    public void setLevelOfHunger(int levelOfHunger) {
        this.levelOfHunger = levelOfHunger;
    }

    public int getLevelOfHunger() {
        return getLevelOfHunger();
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public void setFavoriteFood() {
        System.out.println("Pedigree");
    }

    public void setFavoriteActivity() {
        System.out.println("playing with ball");
    }




    public static void validate(Animal dog) {
        // check if the value is within range
        if (dog.healthCondition < 1 || dog.healthCondition > 10) {
            throw new IllegalArgumentException("The value is outside the accepted range.");
        }
        if (dog.levelOfHunger < 1 || dog.levelOfHunger > 10) {
            throw new IllegalArgumentException("The value is outside the accepted range.");
        }
        if (dog.mood < 1 || dog.mood > 10) {
            throw new IllegalArgumentException("The value is outside the accepted range.");
        } else {
            System.out.println("The dog's health condition is: " + dog.healthCondition);
            System.out.println("The dog's level of hunger is: " + dog.levelOfHunger);
            System.out.println("The dog's mood is: " + dog.mood);
        }
    }
}