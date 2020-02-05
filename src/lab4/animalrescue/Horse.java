package lab4.animalrescue;

public class Horse extends Animal {

    public void sound(){
        System.out.println("Neight");

    }
    public Horse() {
        super();
        System.out.println("A new horse has been created!");
    }

    public void type(){
        System.out.println("This is a race horse");
    }
}
