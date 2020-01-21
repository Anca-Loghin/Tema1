package lab2.animalrescue;

public class Food {
   private String name;
   private int price;
   private int quantity;
   private boolean isAvailable;


    public void setName(String name) {
        this.name = name;
    }
    public String getName (){
        return name;
    }
    public void setPrice (int price){
        this.price = price;
    }
    public int getPrice (){
        return price;
    }

    public void setQuantity (int quantity){
        this.quantity = quantity;
    }
    public int getQuantity (){
        return quantity;
    }

    public void set (){
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable(boolean b) {
        return isAvailable;
    }
}




