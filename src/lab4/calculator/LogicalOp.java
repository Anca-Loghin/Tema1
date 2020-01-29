package lab4.calculator;

public class LogicalOp {

// LAB 4    JAVA FOR LOOPS

    // 1 ok
    public void printto100(int numberTo100) {
        for (int i = numberTo100; i <= 100; i++) {
            System.out.println("Number is" + i);
        }
    }

    // 2 ok
    public void printnegativ100(int numbertToMinus100) {
        for (int i = numbertToMinus100; i >= -100; i--) {
            System.out.println("Number is" + i);
        }
    }

    // 3 ok
    public void countbetween(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    // 4 nok
    public void increasing(int smallest, int bigger) {
        for (int i = smallest; i >= bigger; i--) {
            System.out.println(i);
        }
    }


    // 5 ok
    public void evenNumbers(int number) {
        int nb = 100;
        System.out.println("Even Numbers from 1 to " + nb + " are: ");
        for (int i = 1; i <= nb; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    // 6 ok
    public void oddNumbers(int number) {
        int odd = 100;
        System.out.println("Odd Numbers from 1 to " + odd + " are: ");
        for (int i = 1; i <= odd; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }

    // 7 ok
    public void oneplusanother(int number) {
        int sum = 0;
        int one = number;
        for (int i = one; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    // 8 ok
    public float averagefor(int input) {
        float sum = 0f;
        for (int i = input; i <= 100; i++) {
            sum = sum + i;
        }
        return sum / input;
    }


    // 9 ok
    public void asterix(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// LAB 4     JAVA WHILE LOOP

    // 1 ok
    public void whileprintto100(int a) {
        int i = a;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    // 2 ok
    public void whileprinttominus100(int a) {
        int i = a;
        while (i >= -100) {
            System.out.println((i));
            i--;
        }
    }

    // 3 ok
    public void whileprintfromonetoanother(int start, int end) {
        int i = start;
        while (i <= end) {
            System.out.println((i));
            i++;
        }
    }

    // 4 nok
   // public void whileincreasing(int sml, int big) {
      //  int i = sml;
       // while (big >= i) {
       //     System.out.println((i));
       //     i--;
      //  }
  //  }

    // 5 ok
    public void whileevennumbers(int number) {
        int numb = 0;
        System.out.println("Even Numbers are: ");
        while (numb <= 50) {
            System.out.println(numb * 2);
            numb++;
        }
    }

    // 6 nok
    public void whileoddnumbers(int number) {
        int num = 1;
        System.out.println("Odd Numbers are: ");
        while (num <= 50) {
            System.out.println(num * 2);
            num++;
        }
    }

    // 7 ok
    public float whilegetAverage(int p, int o) {
        float sum = 0;
        float average = 0;
        int counter = 0;
        while (p <= o) {
            sum += p;
            p++;
            counter++;
        }
        average = sum / counter;
        return average;
    }


    // 8 nok
   public int countDivisibles(int A, int B) {
    int i = 0;
    while (i <= 7) {
       System.out.println("i = " + i);
          i++;
        }
        return i;
   }
}

// 9 ok

















