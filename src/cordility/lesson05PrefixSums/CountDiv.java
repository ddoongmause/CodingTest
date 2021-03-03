package cordility.lesson05PrefixSums;

public class CountDiv {
    public static void main(String[] args) {

        solution(6,11, 2);
        solution(9,21, 10);

    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int count = 0;
        int max = Integer.MAX_VALUE;
        double first =(double)A/(double)K;
        double last = (double)B/(double)K;

        for(int i = (int)Math.ceil(first); i<=(int)last; i++) {
            count++;
        }

        return count;
    }

}
