package cordility.lesson04CountingElements;

import java.util.HashSet;

public class PermCheck {

    public static void main(String[] args) {
        int[] a = {4, 1, 3, 2};
        int[] b = {4, 1, 3};
        int[] c = {10, 4, 3, 5, 6};

        solution(a);
        solution(b);
        solution(c);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> arraySet = new HashSet<>();
        int low = 1000000000;
        int high = 0;
        int answer = 0;
        for(int i=0; i<A.length; i++){
            arraySet.add(A[i]);
            if(low > A[i]){
                low = A[i];
            }
            if(high < A[i]){
                high = A[i];
            }
        }

        for(int j=low; j <= high + 1; j++){
            if(!arraySet.contains(j)){
                if((low + arraySet.size() -1) < j){
                    answer = 1;
                }
                break;
            }


        }
        System.out.println(answer);
        return answer;
    }
}
