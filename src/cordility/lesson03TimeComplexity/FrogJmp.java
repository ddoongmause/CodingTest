package cordility.lesson03TimeComplexity;

public class FrogJmp {
    public static void main(String[] args) {
        solution(10, 85, 30);
        solution(10, 97, 5);
        solution(10, 97, 1);
        solution(10, 97, 100);
    }

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count = Y/D;
        int answer = 0;

        if(X==Y){

        }else if(D > Y){
            answer = 1;
        }else if(D == 1){
            answer = Y-X;
        }else if(X+(count*D) >= Y){
            answer = count;
        }else{
            answer = count+1;
        }
        System.out.println(answer);
        return answer;
    }
}
