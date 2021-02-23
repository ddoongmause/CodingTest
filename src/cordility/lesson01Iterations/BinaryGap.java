package cordility.lesson01Iterations;

import java.util.ArrayList;

public class BinaryGap {

    public static void main(String[] args) {
        solution(9);
        solution(529);
        solution(20);
        solution(15);
        solution(32);
        solution(1041);

    }

    public static int solution(int N) {
        ArrayList<Integer> bit = new ArrayList<>();
        int result = 0,
                index = 0;
        while(N != 1)
        {
            if(N%2 == 1){
                bit.add(index);
            };
            N = N/2;
            index++;
        }
        bit.add(index);
        if(bit.size()>1){
            for(int i=bit.size()-1; i>0; i--){
                int result1 = bit.get(i) - bit.get(i-1);
                if(result1 > result){
                    result = result1;
                }
            }
        }
        if(result != 0){
            result -= 1;
        }
        System.out.println(result);
        return result;
    }
}
