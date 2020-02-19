package lab6;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Hello");
        myList.add("Everybody");
        myList.add("Hello");
        myList.get(1);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        LogicalOp logicalOp = new LogicalOp();
        logicalOp.showList(list1, 2);
        logicalOp.addValue(list1, 6);
        logicalOp.printList(myList);


        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(13);
        list2.add(17);
        list2.add(2);
        list2.add(15);
        list2.add(25);
        list2.add(27);
        logicalOp.addFirst(list2, 99);


        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(31);
        list3.add(41);
        list3.add(51);
        list3.add(61);
        list3.add(71);
        logicalOp.addElement(list3, 47);
        logicalOp.addList(list3,99 );



        List<String> list4 = new ArrayList<>();
        list4.add("Apple");
        list4.add("Banana");
        list4.add("Strawberry");
        list4.add("Peach");
        list4.add("Lemon");
        logicalOp.printInverse(list4);
        logicalOp.positionElement(list4, 4, "Red");




    }

}
