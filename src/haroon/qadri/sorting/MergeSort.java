package haroon.qadri.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int [] mergeSort(int[] a) {
        int l = a.length;
        printArray(a);
        if(l > 1) {
            int[] a1 = partition(a, 0, l/2);
            //printArray(a1);
            int[] a2 = partition(a,l/2, l);
            //printArray(a2);
            a = merge(mergeSort(a1), mergeSort(a2));
        }
        return a;
    }

    private static int[] partition(int[] a, int from, int to) {
        int[] newArray = Arrays.copyOfRange(a, from, to);
        printArray(newArray);
        return newArray;
    }

    private  static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<a.length && j<b.length) {
            if(a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
                System.out.println("i <");
            } else {
                c[k] = b[j];
                System.out.println("j <");
                j++;
                k++;
            }
        }
        while(i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
