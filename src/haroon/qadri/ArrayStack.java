package haroon.qadri;

import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

    private E[] stackArray;
    private int top;

    public ArrayStack(int capacity) {
        stackArray = (E[]) new Object[capacity];
        top = -1;
    }

    public void push(E element) {
        top++;
        stackArray[top] = element;
    }

    public E pop() throws EmptyStackException {
        E element = stackArray[top];
        stackArray[top] = null;
        top--;
        return element;
    }

    public E top() {
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
