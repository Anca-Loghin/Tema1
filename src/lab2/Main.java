package lab2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(20, 15));
        System.out.println(sub(20, 15));
        System.out.println(div(20, 15));
        System.out.println(mult(20, 15));
        printName("Anca");
        System.out.println(aver(20, 15, 13));
        System.out.println(rest(20, 15));
        System.out.println(celsius(40));
        System.out.println(metr(23.5f));
        System.out.println(Arrays.toString(velocity(1150, 2, 15, 10, 7510)));
        printJava();
        printFace();

    }
    public static int sum (int x, int y){
        int sum = x + y;
        return sum;
    }
    public static int sub (int x, int y){
        int min = x - y;
        return min;
    }
    public static float div (float x, float y){
        float div = x/y;
        return div;
    }
    public static int mult (int x, int y){
        int mult = x * y;
        return mult;
    }
    public  static void printName (String name){
        System.out.println("Hello");
        System.out.println(name);
    }
    public static int aver (int x, int y, int z){
        int aver = (x + y + z)/3;
        return aver;
    }
    public static int rest (int x, int y){
        int rest =  x % y;
        return rest;
    }
    public static float celsius (float x){
        float celsius = ((x -32) * 5/9);
        return celsius;
    }
    public static float metr (float x){
        float metr = (float) (x * 0.0254);
        return metr;
    }
    public static float[]velocity (float distance, float hr, float min, float sec, float timeinseconds){
        float mps = distance / timeinseconds;
        float kph = ( distance/1000.0f ) / ( timeinseconds/3600.0f );
        float mph = kph / 1.609f;
        return new float[]{mps, kph, mph};
    }
    public static void printJava(){
        System.out.println("   J    a   v     v   a");
        System.out.println("   J   a a   v   v   a a");
        System.out.println("J  J  aaaaa   V V   aaaaa");
        System.out.println(" JJ  a     a   V   a     a ");
    }
    public static void printFace(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +-----+ ");
    }

}



