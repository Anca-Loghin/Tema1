package lab2.animalrescue;

public class AppMain {
   public static void main(String[] args) {
        Animal pet1 = new Animal();

        pet1.setName ("Max");
        System.out.println(pet1.getName());

        pet1.setAge (3);
        System.out.println(pet1.getAge());

        pet1.setHealthCondition(9);
        System.out.println(pet1.getHealthCondition());

        pet1.setLevelOfHunger(7);
        System.out.println(pet1.getLevelOfHunger());

        pet1.setMood(5);
        System.out.println(pet1.getMood());


        Animal pet2 = new Animal();

        pet2.setName ("Nico");
        System.out.println(pet2.getName());

        pet2.setAge (1);
        System.out.println(pet2.getAge());

        pet2.setHealthCondition(10);
        System.out.println(pet2.getHealthCondition());

        pet2.setLevelOfHunger(3);
        System.out.println(pet2.getLevelOfHunger());

        pet2.setMood(9);
        System.out.println(pet2.getMood());


        Adoption adopter = new Adoption();

        adopter.setName("Denis");
        System.out.println(adopter.getName());

        adopter.setMoneyAmount(20);
        System.out.println(adopter.getMoneyAmount());


        Food food = new Food();

        food.setName("Royal");
        System.out.println(food.getName());

        food.setPrice(20);
        System.out.println(food.getPrice());

        food.isAvailable (true);
        System.out.println(food.isAvailable(true));

        RecreationalActivities recreational = new RecreationalActivities();

        recreational.setName("Run on the beach");
        System.out.println(recreational.getName());


        Vet vet = new Vet();

        vet.setName("Evan Antin");
        System.out.println(vet.getName());

        vet.setSpecialization("Anesthesia");
        System.out.println(vet.getSpecialization());
   }


}



