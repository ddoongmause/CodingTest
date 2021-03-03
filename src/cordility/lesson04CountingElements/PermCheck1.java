package cordility.lesson04CountingElements;

import java.util.Arrays;

public class PermCheck1 {
    public static void main(String[] args) {
        int[] a = {4, 1, 3, 2};
        int[] b = {4, 1, 3};

        solution(a);
        solution(b);

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int cnt = 1;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(A[i] == cnt) {
                cnt++;
            } else {
                return 0;
            }
        }

        return 1;
    }
}
