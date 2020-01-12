package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        var greeting = "Hello Anca";
        System.out.println(greeting.replace(" ", "\n"));
//        System.out.print("\n");

        int x = 11;
        long a = 15266;
        float sum = a + x;
        System.out.println(sum);

//
        int z;
        z = 97;
        float y;
        y = 250.15f;
        float rez = z / y;
        System.out.println(rez);

//
        byte c;
        c = -5;
        byte v;
        v = 8;
        int s;
        s = 6;
        System.out.println(c + v * s);

//        System.out.print("\n");
        int cc = 55;
        int ss = 9;
        System.out.println((cc + ss) % ss);

//
        int w = 5;
        float q = -3f;
        int p = 8;
        System.out.println(w*4 + q*w / p);
        int d = 5;
        int i = 3;
        int m = 8;
        System.out.println(d + d*3 / i *2 - m % i);
    }
}
