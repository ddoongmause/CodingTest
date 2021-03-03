package cordility.lesson05PrefixSums;

public class CountDiv1 {

    public static void main(String[] args) {

        solution(6,11, 2);
        solution(9,21, 10);

    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if(A%K == 0) {
            System.out.println(B/K - A/K +1);
            return B/K - A/K +1;
        }

        System.out.println(B/K - A/K);
        return B/K - A/K;


    }
}


