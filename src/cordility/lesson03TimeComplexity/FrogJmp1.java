package cordility.lesson03TimeComplexity;

public class FrogJmp1 {
    public static void main(String[] args) {
        solution(10, 85, 30);
        solution(10, 97, 5);
        solution(10, 97, 1);
        solution(10, 97, 100);
    }

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int answer = 0;
        answer = (int)Math.ceil((Y-X)/(double)D);
        return answer;
    }
}
