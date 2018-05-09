package haroon.qadri;

public interface Queue<E> {

    public void enqueue(E element);
    public E dequeue();
    public E front();
    public int size();
    public boolean isEmpty();
}
