package lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(34);
        list.add(44);
        list.add(54);

        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.println("Please enter a number:");
                int index = scanner.nextInt();
                System.out.println(list.get(index));
                repeat = false;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("The entered index was out of bounds!");
            } catch (InputMismatchException f) {
                System.out.println("Must enter a value!");
            }

            Read read = new Read();

            System.out.println(read.readInt());
            System.out.println(read.readFloat());
            System.out.println(read.readDouble());
            System.out.println(read.readLong());

            List<Integer> list1 = new ArrayList<>();
            list1.add(14);
            list1.add(24);
            list1.add(34);
            list1.add(44);
            list1.add(54);

            List<Integer> myArray = new ArrayList<>();
            myArray.add(12);
            myArray.add(13);
            myArray.add(18);
            myArray.add(99);
            myArray.add(56);
            myArray.add(45);
            myArray.add(78);
            read.readArray(myArray);

            read.sleep();

        }
    }
}

