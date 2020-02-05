package lab4.animalrescue;

public class Dog extends Animal {

    public void sound(){
        System.out.println("Ham");
    }


    public Dog() {
        super();
        System.out.println("A new dog has been created!");
    }

    public void type(){
        System.out.println("This is a race dog");
    }
    public void type1(){
        System.out.println("This is a family dog");
    }
    public void type2(){
        System.out.println("This is a service dog");
    }
        }
