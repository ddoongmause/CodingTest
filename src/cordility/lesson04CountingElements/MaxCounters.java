package cordility.lesson04CountingElements;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxCounters {
    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        solution(5, A);
    }

    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counter = new int[N];
        int max = 0;
        int insertMax = 0;

        for(int i=0; i<A.length; i++){
            if(1<= A[i] && A[i] <= N){
                if(counter[A[i]-1] > insertMax){
                    counter[A[i]-1] = counter[A[i]-1] + 1;
                    if(counter[A[i]-1] > max){
                        max = counter[A[i]-1];
                    }
                }else{
                    counter[A[i]-1] = insertMax + 1;
                    if(counter[A[i]-1] > max){
                        max = counter[A[i]-1];
                    }
                }

            }else if(A[i] == N+1){
                insertMax = max;
            }
        }
        for (int j=0; j<counter.length; j++) {
            if(counter[j] < insertMax){
                counter[j] = insertMax;
            }
        }
        IntStream stream = Arrays.stream(counter);
        stream.forEach(a -> System.out.print(a + ","));
        return counter;
    }
}
