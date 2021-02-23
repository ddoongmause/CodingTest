package cordility.lesson04CountingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        solution(5, A);
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        int answer =-1;
        Set<Integer> way = new HashSet<>();
        for(int i=0; i<A.length; i++){
            if(X>=A[i]){
                way.add(A[i]);
            }
            if(way.size() == X){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
