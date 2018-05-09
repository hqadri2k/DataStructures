package haroon.qadri.sorting;

import java.util.ArrayList;

public class QuickSort {

    public static ArrayList<Integer> quickSort(ArrayList<Integer> a) {
        int l = a.size();
        if(l > 1) {
            int pivot = l/2;
            ArrayList<Integer> less = new ArrayList<Integer>();
            ArrayList<Integer> equal = new ArrayList<Integer>();
            ArrayList<Integer> greater = new ArrayList<Integer>();
            for(int i=0; i<l; i++) {
                if(a.get(i) < a.get(pivot)) {
                    less.add(a.get(i));
                } else if(a.get(i) > a.get(pivot)) {
                    greater.add(a.get(i));
                } else {
                    equal.add(a.get(i));
                }
            }
            a = merge(quickSort(less), equal, quickSort(greater));
        }
        return a;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        for(Integer i : b) {
            a.add(i);
        }
        for(Integer i : c) {
            a.add(i);
        }
        return a;
    }

    public static void printArrayList(ArrayList<Integer> a) {
        for(Integer i : a) {
            if(i == a.get(a.size()-1)) {
                System.out.print(i + "");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
