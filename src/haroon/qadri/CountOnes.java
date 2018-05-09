package haroon.qadri;

public class CountOnes {

    public CountOnes(int[][] A, int i, int j) {

        int length = A[0].length;
        int width = A[1].length;

        int[][] B = new int[length][width];

        int a = 0;
        int b = 0;

        while(a < i && b < j) {
            if(A[a][b] == 1) {
                B[a][b] +=1;
            }
        }

    }
}
