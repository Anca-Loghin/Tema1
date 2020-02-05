package lab4.animalrescue;

public class Animal {
    private String name;
    private int age;
    private String color;
    private static int healthCondition;
    private static int levelOfHunger;
    private static int mood;
    private String gender;

    public Animal (){
        System.out.println("A new animal has been created!");
    }
    public void sleep(){
        System.out.println("This animal sleep");
    }

    public void type(){
        System.out.println("What type is this animal?");
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
    public void sound(){
        System.out.println("Animal is making a sound");
    }


    }


