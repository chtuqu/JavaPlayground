package com.chtuqu.java_playground.programming_puzzles;

public class Palindrome {

    public static boolean isPalindrome(String input) {
        int mid = input.length() / 2;
        for (int i = 0; i < mid; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("rotator"));
        System.out.println(Palindrome.isPalindrome("deified"));

        System.out.println(Palindrome.isPalindrome("autumn"));
    }
}
