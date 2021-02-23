package cordility.lesson04CountingElements;

import java.util.HashSet;

public class PermCheck {

    public static void main(String[] args) {
        int[] a = {4, 1, 3, 2};
        int[] b = {4, 1, 3};

        solution(a);
        solution(b);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> arraySet = new HashSet<>();
        int low = 1000000000;
        int high = 0;
        for(int i=0; i<A.length; i++){
            arraySet.add(A[i]);
            if(low > A[i]){
                low = A[i];
            }
            if(high < A[i]){
                high = A[i];
            }


        }

        for(int j=1; j < 1000000001; j++){
            if(!arraySet.contains(j)){

            }
        }
    }
}
