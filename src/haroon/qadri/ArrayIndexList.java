package haroon.qadri;

public class ArrayIndexList<E> implements IndexList<E> {

    E[] A;
    private int size;
    private int capacity;

    public ArrayIndexList() {
        capacity = 16;
        size = 0;
        A = (E[]) new Object[capacity];
    }

    public void add(int r, E e) {
        checkInRange(r, size+1);
        if (size == capacity) {
            capacity = capacity * 2;
            E[] B =  (E[]) new Object[capacity];
            for(int i=0; i<A.length; i++) {
                B[i] = A[i];
            }
        }
        for (int j = size - 1; j >= r; j--) {
            A[j + 1] = A[j];
        }
        A[r] = e;
        size++;
    }

    public E set(int r, E e) {
        checkInRange(r, size+1);
        E element = A[r];
        A[r] = e;
        return element;
    }

    public E get(int r) {
        checkInRange(r, size+1);
        return A[r];
    }

    public E remove(int r) {
        checkInRange(r, size+1);
        E e = A[r];
        for(int i = r+1; i<=size-1; i++) {
            A[i-1] = A[i];
        }
        A[size--] = null;
        return e;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public void checkInRange(int i, int n) throws IndexOutOfBoundsException {
        if(i<0 || i>=n) throw new IndexOutOfBoundsException("Index out of bound");
    }
}
