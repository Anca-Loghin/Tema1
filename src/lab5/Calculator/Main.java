package lab5.Calculator;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.HashSet;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //2. In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
        // Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main()
        // pentru a verifica daca functioneaza.

        int[] myArray = new int[100];
        LogicalOp op = new LogicalOp();
        for (int i = 0; i < 100; i++) {
            out.println(op.arrayToHundred()[i]);
        }

        //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat
        // cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza.
        // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

        for (int i = 0; i < 100; i++) {
            out.println(op.arrayEven()[i]);
        }


        //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
        // Metoda sa calculeze si sa returneze media numerelor din array. Apelati metoda in main()
        // pentru a verifica daca functioneaza.

        int arrNumbers[] = new int[]{1, 3, 2, 5, 9};
        int sum = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            sum = sum + arrNumbers[i];
        }
        double average = sum / arrNumbers.length;
        System.out.println("Average is: " + average);

        //5.  Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
        // si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in
        // array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        String[] arr1 = {"Anca", "Andreea", "Vlad", "Doru", "Mihai", "Ana"};
        System.out.println(op.trueOrFalse(arr1, "Doru"));
        System.out.println(op.trueOrFalse(arr1, "Ada"));

        //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru
        // de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa
        // returneze pozitia pe care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.

        int[] my_array = {12, 17, 55, 25, 27, 29, 66, 34};
        System.out.println("Pozitia nr 27 este:" + op.findNumber(my_array, 27));
        System.out.println("Pozitia nr 66 este:" + op.findNumber(my_array, 66));

        //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" - ", a[i][j]);
            }
            System.out.println();
        }

        //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un
        // parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da,
        // sa returneze array-ul primit, fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.

        int[] my_array1 = {1986, 1977, 1985, 1956, 1999, 2003, 2011};
        System.out.println(op.contains(my_array1, 1985));
        System.out.println(op.contains(my_array1, 2009));

        //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        int[] my_array2 = {7, 11, 13, 4, 2, 9};
        System.out.println("Al doilea cel mai mic numar e:" + op.secondSmaller(my_array2));

        //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
        // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        int[] my_array3 = {11, 13, 5, 17, 19, 21, 23};
        int[] new_array = new int[7];
        System.out.println(op.newArray(new_array));

        //1. 1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului
        // polimorfismului. Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
        //
        //Spre exemplu, pentru metoda de adunare, faceti ca aceasta sa lucreze o data cu 2 int-uri,
        // o data cu 2 float-uri, cu 3 float-uri, cu 4 int-uri, etc. Atentie ce returnati la final!
        //
        //Apelati metodele in Main pentru a testa daca functioneaza.

        LogicalOp logicalop = new LogicalOp();

        System.out.println(logicalop.add(7, 14));
        System.out.println(logicalop.add(11, 14, 47));
        System.out.println(logicalop.add(12.123f, 11.354f, 1.5f));
        System.out.println(logicalop.add(14.33, 22.11));
        System.out.println(logicalop.add(77, 54, 14));
        System.out.println(logicalop.add(14.3, 1.2, 3.1));


        int[] array1 = {11, 13, 5, 17, 19, 21, 23};

        System.out.println(op.returnAnotherArray(array1));

        //Tema optionala

        // 2. Creati o metoda care insereze un element pe o pozitie specifica intr-un array. nok

        int[] arrayposition = { 14,25,26,88,45,33,21,11,22};
        int indexposition = 3;
        int newValue = 7;
        for (int i = arrayposition.length-1; i> indexposition; i--){
            arrayposition[i] = arrayposition[i-1];
        }
        arrayposition[indexposition] = newValue;
        System.out.println((arrayposition));

        // 3. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.


        // 4. Creati o metoda care sa inverseze valorile unui array de int-uri. ok

        int[] ar = {22, 14, 15, 77, 896, 22, 77};
        ar = op.invertedArray(ar);
        op.printArray(ar);

        // 5. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
        //ok

        int[] myarray1 = {11,12,14,11,15,17,14,19,22,19};
        for (int i = 0; i < myarray1.length; i++){
            for ( int j = i + 1; j < myarray1.length; j++){
                if ((myarray1[i] == myarray1[j] && (i != j))){
                    System.out.println("Duplicate element:" + myarray1[j]);
                }
            }
        }

        //6. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).
        // ok dar returneaza de 6 ori.
        String[] arrayone = {"Rosu", "Verde", "Roz", "Maro", "Albastru", "Mov"};
        String[] arraytwo = {"Galben", "Indigo", "Negru", "Argintiu", "Rosu"};
        HashSet<String> h = new HashSet<String>();
        for (int i = 0; i < arrayone.length; i++) {
            for (int j = 0; j < arraytwo.length; j++) {
                if (arrayone[i].equals(arraytwo[j])) {
                    h.add(arrayone[i]);
                }
            }
            System.out.println("Common element:" + (h));
        }


        // 7. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.
        // ok


        int[] arr = { 11,25,1,9,220,5,89,55,997};
        op.printArray(op.sortAsc(arr));



    }
}