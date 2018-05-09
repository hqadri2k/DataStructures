package haroon.qadri;

public class Node<E> {

    private E element;
    private Node next;

    public Node(E element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node(E element) {
        this.element = element;
    }

    public Node() {

    }

    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

}
