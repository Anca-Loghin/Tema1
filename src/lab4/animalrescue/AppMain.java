package lab4.animalrescue;

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

        Animal.validate(pet1);

        Cat Amstie = new Cat();
        Amstie.setAge(2);
        Amstie.setHealthCondition(9);

        Duck Gary = new Duck();
        Gary.setColor("brown");


        Animal animal = new Animal();
        Animal dog5 = new Dog();
        Animal duck = new Duck();
        Animal horse = new Horse();
        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println("Duck class:");
        duck.sound();

        System.out.println("Horse class:");
        horse.sound();

        System.out.println("Dog class:");
        dog.sound();

        System.out.println("Cat class:");
        cat.sound();

        Cat Garfield = new Cat();
        System.out.println();
        animal.sleep();
        animal.sound();
        cat.sleep();
        cat.sound();

        Horse Jamila = new Horse();
        System.out.println();
        horse.sound();
        horse.type();


   }


}



