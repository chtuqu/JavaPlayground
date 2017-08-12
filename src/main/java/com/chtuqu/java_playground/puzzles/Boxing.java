package com.chtuqu.java_playground.puzzles;

public class Boxing {
    static Integer x;
    public static void main(String[] args) {
        doStuff(x);     // exception on this line
    }

    static void doStuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z); // not on this line
    }
}
