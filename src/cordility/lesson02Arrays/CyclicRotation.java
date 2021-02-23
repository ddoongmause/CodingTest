package cordility.lesson02Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int[] B = {0, 0, 0};
        int[] C = {1, 2, 3, 4};

        solution(A, 3);
        solution(B, 1);
        solution(C, 4);

    }

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int max = A.length;
        int[] result = new int[max];

        for(int i=0; i<max; i++){
            int resultNumber = 0;
            resultNumber = i+K;
            if(resultNumber >= max){
                while (resultNumber >= max){
                    resultNumber -= max;
                }
            }
            result[resultNumber] = A[i];
        }
        IntStream intStream = Arrays.stream(result);
        intStream.forEach(a -> System.out.print(a));
        System.out.println();
        return result;
    }

}
