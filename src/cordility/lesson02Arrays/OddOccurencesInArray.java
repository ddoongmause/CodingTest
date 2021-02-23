package cordility.lesson02Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class OddOccurencesInArray {
    public static void main(String[] args) {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        solution(a);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        HashMap<Integer, Integer> box = new HashMap<>();
        IntStream stream = Arrays.stream(A);
        stream.forEach(
               (a) -> {
                   if(box.containsKey(a)){
                       int savedInt = box.get(a);
                       if(savedInt%2 == 0){
                           box.put(a, savedInt-a);
                       }else{
                           box.put(a, savedInt+a);
                       }

                   }else{
                       box.put(a, a);
                   }
                }
        );
        System.out.println(box.values());
        for (int value: box.values()) {
            if(value % 2 == 1){
                answer = value;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
