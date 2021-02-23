package cordility.lesson02Arrays;

public class OddOccurencesInArray02 {
    public static void main(String[] args) {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        solution(a);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer ^= A[i];
        }
        System.out.println(answer);
        return answer;
    }
}
