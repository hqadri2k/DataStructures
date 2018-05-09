package haroon.qadri;

public class CircularQueue<E> implements Queue<E> {

    private int front;
    private int rear;
    private int max;
    private E[] A;

    public CircularQueue(int size) {
        max = size;
        A = (E[]) new Object[max];
        front = 0;
        rear = 0;
    }

    public void enqueue(E element) {
        if(isFull()) {
            System.out.println("Full queue");
        } else {
            A[rear] = element;
            rear++;
            rear = rear % max;
        }
    }

    public E dequeue() {
        if(size() == 0) {
            System.out.println("Empty queue");
            return null;
        } else {
            E element = A[front];
            A[front] = null;
            front++;
            front = front % max;
            return element;
        }
    }

    public E front() {
        return A[front];
    }

    public int size() {
        return ( ((rear - front) + max) % max);
    }

    public boolean isFull() {
        return (size() == max-1);
    }

    public boolean isEmpty() {
        return (front == rear);
    }
}
