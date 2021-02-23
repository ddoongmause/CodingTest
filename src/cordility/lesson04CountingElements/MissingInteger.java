package cordility.lesson04CountingElements;

import java.util.HashSet;

public class MissingInteger {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2};
        int[] b = {1, 2, 3};
        int[] c = {-1, -3};
        solution(a);
        solution(b);
        solution(c);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        int max = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<A.length; i++){
            if(A[i] <0){
                set.add(0);
            }else{
                set.add(A[i]);
            }
        }
        for(int j=1; j<max; j++){
            if(!set.contains(j)){
                answer = j;
                break;
            }else if(j>set.size()){
                answer = j;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
