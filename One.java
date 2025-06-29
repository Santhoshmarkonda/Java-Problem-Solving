package com.problemsolving;

public class One {

    public void getFibonacci(int N) {
        int a = 0;
        int b = 1;

        if (N >= 1)
            System.out.println(a);
        if (N >= 2)
            System.out.println(b);

        for (int i = 3; i <= N; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        One one = new One();
        one.getFibonacci(20);
    }
}
