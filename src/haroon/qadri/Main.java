package haroon.qadri;

import haroon.qadri.sorting.MergeSort;
import haroon.qadri.sorting.QuickSort;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* arrayStack = new ArrayStack(50);
        System.out.println(arrayStack.isEmpty());
        arrayStack.push(5);
        arrayStack.push(10);
        System.out.println(arrayStack.top());
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.top());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.isEmpty());*/

        /*System.out.println();
        CircularQueue cq = new CircularQueue(3);
        cq.enqueue(5);
        cq.enqueue(10);
        System.out.println(cq.size());
        System.out.println(cq.front());
        cq.enqueue(11);
        cq.enqueue(4);
        System.out.println(cq.size());
        System.out.println(cq.dequeue());
        System.out.println(cq.front());
        System.out.println(cq.size());*/

        /*System.out.println();
        NodeQueue nq = new NodeQueue();
        nq.front();
        nq.rear();
        nq.enqueue(1);
        System.out.println(nq.front());
        System.out.println(nq.rear());
        nq.enqueue(5);
        System.out.println(nq.front());
        System.out.println(nq.rear());
        System.out.println(nq.dequeue());
        System.out.println(nq.front());
        System.out.println(nq.rear());
        System.out.println(nq.dequeue());
        nq.dequeue();*/

        /*ArrayIndexList a = new ArrayIndexList();
        a.add(0, 10);
        //a.get(2);
        System.out.println(a.get(0)); // 10
        a.add(1, 33);
        a.add(2, 44);
        System.out.println(a.get(1)); // 33
        System.out.println(a.get(2)); // 44
        System.out.println(a.set(1,22)); // 33
        System.out.println(a.size());
        System.out.println(a.remove(1)); // 22
        System.out.println(a.get(1)); //44*/

        /*NodePositionList n = new NodePositionList();
        n.first();
        n.addFirst(10);
        System.out.println(n.last().element());
        System.out.println(n.first().element());
        n.addLast(20);
        System.out.println(n.last().element());
        System.out.println(n.first().element());
        n.remove(n.last());
        System.out.println(n.last().element());
        System.out.println(n.first().element());
        n.remove(n.first());
        n.last();
        n.first();*/

        int[] lol = {10, 5, 3, 919, 24, 45, 3838, 38382883, 0, -24, 0, 38382883};
        /*int [] lool = MergeSort.mergeSort(lol);
        MergeSort.printArray(lool);*/


        ArrayList<Integer> i = new ArrayList<Integer>();
        for(int j=0; j<lol.length; j++) {
            i.add(lol[j]);
        }
        i = QuickSort.quickSort(i);
        QuickSort.printArrayList(i);
    }
}
