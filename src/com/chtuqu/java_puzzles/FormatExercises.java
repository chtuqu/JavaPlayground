package com.chtuqu.java_puzzles;

public class FormatExercises {
    public static void main(String[] args) {
        // what will be printed?
        System.out.println(String.format(">%-5c<", 'c'));
        System.out.println(String.format(">%+0d<", 100));
        System.out.println(String.format("\"$%(,9.2f\"", -1222.2));
        System.out.println(String.format("%b", 100));
        System.out.println(String.format("\"%c\"", new Character('d')));
        System.out.println(String.format("%s", new Object()));
        System.out.println(String.format("\"%f\"", -100));
    }
}
