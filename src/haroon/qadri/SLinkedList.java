package haroon.qadri;

import java.util.EmptyStackException;

public class SLinkedList<E> {

    private int size;

    private Node<E> head;
    private Node<E> tail;

    public SLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtHead(E elem) {
        Node<E> node = new Node(elem);
        if(size == 0) {
            tail = node;
            node.setNext(null);
        } else {
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void removeAtHead() {
        head.setElement(null);
        Node node = head.getNext();
        head = null;
        head = node;
        size --;
    }

    public void insertAtTail() {
        Node node = new Node();
        tail.setNext(node);
        size++;
        tail = node;
    }

}
