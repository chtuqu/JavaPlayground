package com.chtuqu.java_puzzles;

// 1. What will the code print?
// 2. What will the code print if getData() got deleted from Layer?
public class Onion {
    private String data = "skin";

    private class Layer extends Onion {
        String data = "thegoodpart";
        public String getData() {
            return data;
        }
    }

    public String getData() {
        return new Layer().getData();
    }

    public static void main(String[] args) {
        Onion o = new Onion();
        System.out.println(o.getData());
    }
}
