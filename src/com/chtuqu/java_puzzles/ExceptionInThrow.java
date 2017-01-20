package com.chtuqu.java_puzzles;

public class ExceptionInThrow {
    static { /*throw new RuntimeException();*/ } // does not compile
    static { if (true) throw new RuntimeException(); } // compiles
}
