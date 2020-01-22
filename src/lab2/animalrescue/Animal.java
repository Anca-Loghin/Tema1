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


}