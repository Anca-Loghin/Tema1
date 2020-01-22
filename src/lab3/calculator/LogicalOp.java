package lab3.calculator;

public class LogicalOp {

    public static int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyText(String text) {
        if (text.equals("FastTrackIt")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public static String verifyText1(String text1, int a) {
        if (text1.equals("FasttrackIt") && a <= 3) {
            return ("FastTrackIt" + " " + "3");
        } else if (!text1.equals("FasttrackIt") && a >= 4) {
        }
        return (text1 + " " + "4");
    }


    public static String verifyText3(String text3, String text4, int q) {
        if (q > 8 || q == 6) {
            return ("The amount of snow this winter was(cm):" + q);
        } else {
            return ("The forecast snow is(cm):" + q);
        }
    }

    ////Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3,
    //        // SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4,
    //        // returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
    //        // Apelati metoda in main() pentru a verifica daca functioneaza.

    public static String verifyText4(String text5, String text6, String text7, int r) {
        if (r > 3 && r != 4) {
            return (text5);
        } else if (r == 4) {
            return (text6);
        } else if (r < 3) {
            return (text7);
        }
        return (text5);
    }

    //Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit. Folosind constructia
    // Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte
    // numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul
    // de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public static String verifyThisNo (int gr, String grString) {
        if (gr == 1){
            return ("The number is:" + 1);
        }else if (gr == 2){
            return ("The number is:" + 2);
        }

        switch (gr){
            case 1: grString = ("The number is:" + 1);
            break;
            case 2: grString = ("The number is:" + 2);
            break;
            case 3: grString = ("The number is:" + 3);
            break;
            case 4: grString = ("The number is:" + 4);
            break;
            case 5: grString = ("The number is:" + 5);
            break;
            case 6: grString = ("The number is:" + 6);
            break;
            case 7: grString = ("The number is:" + 7);
            break;
            case 8: grString = ("The number is:" + 8);
            break;
            case 9: grString= ("The number is:" + 9);
            break;
            case 10: grString = ("The number is:" + 10);
            break;
            default:
                grString = "Invalid grade";
                break;
        }
        return grString;
    }

    public int intMax (int cc, int aa, int zz){
        if (cc>aa && cc>zz ){
            return cc;
        }
        if (aa>cc && aa>zz){
            return aa;
        }
        else {
            return zz;
        }
    }
    public boolean isEligibleToVote (int age1){
        if ((age1 >= 18)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isNumberEven (int number){
        if ((number % 2 == 0)){
            return true;
        }else {
            return false;
        }
    }


    }

