package lab2.animalrescue;


public class AppMain {
    public static void main(String[] args) {
        Animal pet1 = new Animal();
        pet1.name = "Max";
        pet1.age = 3;
        pet1.healthCondition = 9;
        pet1.mood = 5;
        pet1.levelOfHunger = 7;

        Animal pet2 = new Animal();
        pet2.name = "Kumba";
        pet2.age = 1;
        pet2.healthCondition = 10;
        pet2.mood = 9;
        pet2.levelOfHunger = 3;

        Adoption adopter = new Adoption();
        adopter.name = "Denis";
        adopter.moneyAmount = 20;

        Food food = new Food();
        food.name = "Royal";
        food.price = 20;
        food.isAvailable = true;

        RecreationalActivities recreational = new RecreationalActivities();
        recreational.name = "Run on the beach";

        Vet vet = new Vet();
        vet.name = "Evan Antin";
        vet.specialization = "Anesthesia";

        Animal.validate(pet1);
        Animal.validate(pet2);

        System.out.println(pet2.name);
        pet1.setFavoriteFood();
        pet2.setFavoriteActivity();
        System.out.println(pet2.mood);
        System.out.println(food.name);
        System.out.println(food.price);
        System.out.println(recreational.name);
        System.out.println(vet.name);
        System.out.println(adopter.name);

    }
}



