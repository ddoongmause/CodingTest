package cordility.lesson02Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;

public class OddOccurencesInArray01 {
    public static void main(String[] args) {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        solution(a);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        LinkedHashSet<Integer> box = new LinkedHashSet<>();
        IntStream stream = Arrays.stream(A);
        stream.forEach(
                (a) -> {
                    if(box.contains(a)){
                       box.remove(a);

                    }else{
                        box.add(a);
                    }
                }
        );
        Iterator<Integer> iterator = box.iterator();
        while (iterator.hasNext()){
            answer = iterator.next();
        }

        System.out.println(answer);
        return answer;
    }
}
