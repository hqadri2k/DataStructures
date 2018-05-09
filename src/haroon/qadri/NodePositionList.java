package haroon.qadri;


public class NodePositionList<E> implements PositionList<E> {

    private DNode<E> header,trailer;
    private int size;

    public NodePositionList() {
        size = 0;
        header = new DNode(null, null, null);
        trailer = new DNode(null, header, null);
        header.setNext(trailer);
    }

    public Position<E> first() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return null;
        } else {
            return header.next();
        }
    }

    public Position<E> last() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return null;
        } else {
            return trailer.prev();
        }
    }

    public Position<E> next(Position<E> p) {
        DNode node = checkPosition(p);
        if(node != null) {
            return node.next();
        } else {
            return null;
        }
    }

    public Position<E>  prev(Position<E> p) {
        DNode node = checkPosition(p);
        if(node != null) {
            return node.prev();
        } else {
            return null;
        }
    }

    public void addFirst(E e) {
        DNode node = new DNode();
        node.setElement(e);
        node.setNext(header.next());
        node.setPrev(header);
        header.next().setPrev(node);
        header.setNext(node);
        size++;
    }

    public void addLast(E e) {
        DNode node = new DNode();
        node.setElement(e);
        node.setNext(trailer);
        node.setPrev(trailer.prev());
        trailer.prev().setNext(node);
        trailer.setPrev(node);
        size++;
    }

    public void addAfter(Position<E> p, E e) {
        DNode posNode = checkPosition(p);
        if (posNode != null) {
            DNode node = new DNode();
            node.setElement(e);
            node.setPrev(posNode);
            node.setNext(posNode.next());
            posNode.next().setPrev(node);
            posNode.setNext(node);
            size++;
        }
    }

    public void addBefore(Position<E> p, E e) {
        DNode posNode = checkPosition(p);
        if (posNode != null) {
            DNode node = new DNode();
            node.setElement(e);
            node.setNext(posNode);
            node.setPrev(posNode.prev());
            posNode.prev().setNext(node);
            posNode.setPrev(node);
            size++;
        }
    }

    public E set(Position<E> p, E e) {
        DNode node = checkPosition(p);
        if(node != null) {
            E oldE = (E) node.element();
            node.setElement(e);
            return oldE;
        } else {
            return null;
        }
    }

    public E remove(Position<E> p) {
        DNode node = checkPosition(p);
        if(node != null) {
            DNode next = node.next();
            DNode prev = node.prev();
            node.prev().setNext(next);
            node.next().setPrev(prev);
            E e = (E) node.element();
            node.setElement(null);
            node.setPrev(null);
            node.setNext(null);
            size--;
            return e;
        }
        return null;
    }

    private DNode<E> checkPosition(Position<E> p) {
        if(p == null || p == header || p == null) {
            System.out.println("Invalid position");
            return null;
        } else {
            DNode<E> node = (DNode<E>) p;
            return node;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

}
