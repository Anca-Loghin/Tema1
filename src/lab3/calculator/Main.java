package lab3.calculator;

public class Main {

    public static void main(String[] args) {
        int first = 10;
        int second = 27;
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(first, second);
        System.out.println("The bigger number is: " + biggest);

        String text = "FastTrackIt";
        String text2 = new String(("FastTrackIt"));
        System.out.println(op.verifyText(text));

        //Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
        // Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3,
        // returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
        // returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.

        String text1 = "LearnIt";
        int a = 17;
        System.out.println(op.verifyText1(text1, a));

        // Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8,
        // SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze
        // “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

        String text3 = "The amount of snow this winter was(cm):";
        String text4 = "The forecast snow is(cm):";
        int q = 5;
        System.out.println(op.verifyText3(text3, text4, q));

        //Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3,
        // SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4,
        // returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        String text5 = "The number is greater than 3 and not equal to 4";
        String text6 = "The number is equal to 4";
        String text7 = "The number is lower than 3";
        int r = 4;
        System.out.println(op.verifyText4(text5, text6, text7, r));

         //Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit. Folosind constructia
        // Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte
        // numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul
        // de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        int gr = 7;
        String grString = new String();
        System.out.println(gr);
        System.out.println(op.verifyThisNo(gr, grString));


        // Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
        // si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        int number = 11;
        System.out.println(op.isNumberEven(number));

        //Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
        // care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
        // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
        // Apelati metoda in main() pentru a verifica daca functioneaza.


        int age1 = 19;
        System.out.println(op.isEligibleToVote(age1));


        //Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

     int cc = 12;
     int aa = 54;
     int zz = 27;
        System.out.println(op.intMax(cc, aa, zz));

    }
}


