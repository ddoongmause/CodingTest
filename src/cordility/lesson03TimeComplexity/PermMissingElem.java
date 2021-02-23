package cordility.lesson03TimeComplexity;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 5};
        solution(a);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int sumArrays = 0;
        int sumNumbers = 0;
        int answer = 0;
        for(int i=0; i<A.length; i++){
            sumArrays += A[i];
            sumNumbers += i+1;
        }
        answer = A.length -(sumArrays - sumNumbers) +1;
        System.out.println(answer);
        return answer;
    }
}
