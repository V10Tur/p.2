package com.company;

public class com {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                s = s + i;
        }


        System.out.print(s);
    }
}