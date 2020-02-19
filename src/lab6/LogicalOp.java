package lab6;

import java.util.List;
import java.util.ArrayList;

public class LogicalOp {

    public void addValue(List<Integer> list, int number) {
        list.add(number);
    }


    //1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou.ok

    public void printList(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println((myList.get(i)));
        }
    }
    //2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt
    // un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista. ok insa se poate si fara add?

    public void addList(List<Integer> list3, int numb) {
        list3.add(6, 99);
        for (Integer number : list3) {
            System.out.println("Number = " + number);
        }
    }
    //3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar
    // intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
    // pornind de la numarul intreg primit ca si parametru. ok

    public void showList(List<Integer> list1, int number) {
        for (int i = number; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
    }

    //4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
    // dar invers(de la capat la inceput). ok
    public void printInverse(List<String> list4) {
        for (int i = list4.size(); i-- > 0; ) {
            System.out.println(list4.get(i));
        }
    }


        //5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg
        // , si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip
        // intreg reprezinta pozitia la care sa fie pus acel String.
    public void positionElement (List<String> list4, int number, String color){
        for(String element : list4){
           

        }


        }



        //6. Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda
        // sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.ok
        public void addFirst(List<Integer> list2, int numb) {
            list2.add(0, 99);
            for (Integer number : list2) {
                System.out.println("Number = " + number);
            }
        }


        //7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
        // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).ok

        public void addElement(List<Integer> list3, int number){
            for (int i = 0; i < list3.size(); i++) {
                System.out.println("Pe pozitia " + i + " valoarea este:" + list3.get(i));
            }
        }



        //8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    }








