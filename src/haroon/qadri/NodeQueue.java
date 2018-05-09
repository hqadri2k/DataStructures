package haroon.qadri;

public class NodeQueue<E> implements Queue<E> {

    private Node head;
    private Node tail;
    int size;

    public NodeQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(E element) {
        Node<E> node = new Node(element);
        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public E dequeue() {
        if(isEmpty()) {
            System.out.println("Empty queue");
            return null;
        } else {
            E element = (E) head.getElement();
            head.setElement(null);
            head = head.getNext();
            size--;
            return element;
        }
    }

    public E front() {
        if(isEmpty()) {
            System.out.println("Empty queue");
            return null;
        } else {
            E element = (E) head.getElement();
            return element;
        }
    }

    public E rear() {
        if(isEmpty()) {
            System.out.println("Empty queue");
            return null;
        } else {
            E element = (E) tail.getElement();
            return element;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
