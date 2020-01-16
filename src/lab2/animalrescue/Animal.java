package lab2.animalrescue;

public class Animal {
    public String name;
    public int age;
    public int healthCondition;
    public int levelOfHunger;
    public int mood;

    public void setFavoriteFood() {
        System.out.println("Pedigree");
    }
    public void setFavoriteActivity() {
        System.out.println("playing with ball");
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
