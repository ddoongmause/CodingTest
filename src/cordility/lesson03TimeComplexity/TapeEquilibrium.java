package cordility.lesson03TimeComplexity;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4, 3};
        int[] b = {3, 1};
        int[] c = {0, 0};
        int[] d = {1, 1};
        int[] e = {-1, 1};
        int[] f = {-1000, 1000};
        /*solution(a);
        solution(b);
        solution(c);
        solution(d);*/
        //solution(e);
        solution(f);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int answer = Integer.MAX_VALUE;
        int total = 0;
        int first = 0;
        for(int i=0; i<A.length; i++){
            total += A[i];
        }

        for(int j=1; j<A.length; j++){
            int last = 0;
            int semiAnswer = 0;
            first += A[j-1];
            last = total - first;
            semiAnswer = Math.abs(first - last);
            if(semiAnswer < answer){
                answer = semiAnswer;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
