package com.chtuqu.java_playground.programming_puzzles.stack.node_stack;

public interface Node<T> {
    T getValue();
    void setValue(T t);

    Node<T> getNext();
    void setNext(Node<T> t);
}
