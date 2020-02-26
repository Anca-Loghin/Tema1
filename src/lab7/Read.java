package lab7;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Read {
    public int readInt() {
        boolean repeat = true;
        int number = 0;
        while (repeat) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number");
            } finally {
                System.out.println("Thank you!");
            }
        }
        return number;
    }

    public float readFloat() {
        boolean repeat = true;
        float number = 0;
        while (repeat) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a float");
            }
        }
        return number;
    }

    public double readDouble() {
        boolean repeat = true;
        double number = 0;
        while (repeat) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a double");
            }
        }
        return number;
    }

    public long readLong() {
        boolean repeat = true;
        long number = 0;
        while (repeat) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = (long) scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a long");
            }
        }
        return number;
    }

    //3.In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public void readArray(List<Integer> myArray) {
        System.out.println("Elements in the array are: ");
        System.out.println(Arrays.toString(new List[]{myArray}));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the required element: ");
        try {
            int element = scanner.nextInt();
            System.out.println("Element in the given index is: " + myArray.get(element));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The number you entered is invalid");
            System.out.println("Please enter an index number between 0 and 6");
        }
    }

    //4.  In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
    // Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar,
    // sa se intrerupa citirea) nok

    public void readList(List<Integer> list) {
        System.out.println("Elements in the list are: ");
        System.out.println(Arrays.toString(new List[]{list}));
        Scanner scanner = new Scanner(System.in);


    }

    //5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul:
    // "Inside catch, number too large". nok

    public void readPosition(List<Integer> list1, int number) {
        var maxAllowedSize = 12;
        System.out.println("Elements in the list are: ");
        System.out.println(Arrays.toString(new List[]{list1}));
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
            System.out.println("The value from the number position is: " + list1.get(number));
            if (list1.size() > maxAllowedSize) ;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");

        }
    }

    //6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru
    // de tip int. In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea
    // in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.



    public void sleep()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}









