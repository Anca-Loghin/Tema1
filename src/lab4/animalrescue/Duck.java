package lab4.animalrescue;

public class Duck extends Animal {
    public void sound(){
        System.out.println("Quack");
    }
    public Duck() {
        super();
        System.out.println("A new duck has been created!");
    }
    public void type(){
        System.out.println("This animal has feathers");
    }


}
