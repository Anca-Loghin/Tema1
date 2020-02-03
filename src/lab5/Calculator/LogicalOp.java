package lab5.Calculator;

public class LogicalOp {

    //2. ok

    public int[] arrayToHundred() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //3. returneaza de mai multe ori

    public int[] arrayEven() {
        int[] array = new int[100];
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return array;
    }

    //4. ok

    public int arrayAverage() {
        int[] array = {1, 2, 3, 4};
        int total = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
            average = total / array.length;
            System.out.println(average);
        }
        return average;
    }

    //5. nok
    //public static boolean trueOrFalse (String[] arr, String value){
    //for (String i: arr){
    // if(value == i){
    //     return true;
    // }
    // return false;
    // }

    //6.ok

    public int findNumber(int[] my_array, int z) {
        if (my_array == null) return -1;
        int leng = my_array.length;
        int i = 0;
        while (i < leng) {
            if (my_array[i] == z) return i;
            else i = i + 1;
        }
        return -1;

    }

    //7.ok

    public void grille(String[] args) {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" - ", a[i][j]);
            }
            System.out.println();
        }
    }

    //8. ok

    public boolean contains(int[] array, int item) {
        for (int n : array) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    //9.ok

    public int secondSmaller(int[] array) {
        int[] my_array2 = {7, 11, 13, 4, 2, 9};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < my_array2.length; i++) {
            if (my_array2[i] == min) {
                secondMin = min;
            } else if (my_array2[i] < min) {
                secondMin = min;
                min = my_array2[i];
            } else if (my_array2[i] < secondMin) {
                secondMin = my_array2[i];
            }
        }
        return secondMin;
    }

    //10.nok

    public int[] newArray(int[] array) {
        int[] my_array3 = {11, 13, 5, 17, 19, 21, 23};
        int[] new_array = new int[7];
        for (int i = 0; i < my_array3.length; i++) {
            new_array[i] = my_array3[i];
        }
        return new_array;
    }

    //1.ok

    public int add(int x, int y){
        return x+y;
    }

    public int add(int x, int y, int z, int w){
        return x+y+z+w;
    }

    public float add(float x, float y, float z){
        return x+y+z;
    }

    public double add (double x, double y){
        return x*y;
    }

    public double add(double x, double y, double z){
        return  z-y-z;
    }





}


