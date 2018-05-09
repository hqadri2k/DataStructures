package haroon.qadri;

public interface PositionList<E> {


    public int size();
    public boolean isEmpty();

    public Position<E> first();
    public Position<E> last();

    public Position next(Position<E> p);
    public Position prev(Position<E> p);

    public void addFirst(E e);
    public void addLast(E e);
    public void addAfter(Position<E> p, E e);
    public void addBefore(Position<E> p, E e);

    public E remove(Position<E> p);
    public E set(Position<E> p, E e);
}
