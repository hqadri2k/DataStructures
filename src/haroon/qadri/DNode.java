package haroon.qadri;

public class DNode<E> implements Position<E> {

    private E element;
    private DNode<E> prev, next;

    public DNode() {

    }
    public DNode(E element, DNode prev, DNode next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public DNode prev() {
        return prev;
    }

    public DNode next() {
        return next;
    }

    public void setNext(DNode node) {
        next = node;
    }

    public void setPrev(DNode node) {
        prev = node;
    }

    public void setElement(E e) {
        element = e;
    }

    public E element() {
        return element;
    }
}
