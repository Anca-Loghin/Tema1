package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        var greeting = "Hello Anca";
        System.out.print(greeting.replace(" ", "\n"));
        System.out.print("\n");

        int x = 11;
        long a = 15266;
        float sum = a + x;
        System.out.print(sum);

        System.out.print("\n");
        int z;
        z = 97;
        float y;
        y = 250.15f;
        float rez = z / y;
        System.out.print(rez);

        System.out.print("\n");
        byte c;
        c = -5;
        byte v;
        v = 8;
        int s;
        s = 6;
        System.out.print(c + v * s);

        System.out.print("\n");
        int cc = 55;
        int ss = 9;
        System.out.print((cc + ss) % ss);

        System.out.print("\n");
        int w = 5;
        float q = -3f;
        int p = 8;
        System.out.print(w*4 + q*w / p);

        System.out.print("\n");
        int d = 5;
        int i = 3;
        int m = 8;
        System.out.print(d + d*3 / i *2 - m % i);
    }
}
