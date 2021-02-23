package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort02 {
    private static List<String> now = new ArrayList<>();
    private static int nowResult = 0;

    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        int[] numbers3 = {0, 0, 0};
        int[] numbers4 = {0, 5, 10, 15, 20};
        int[] numbers5 = {1000, 0, 5, 99, 100};




        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
        System.out.println(solution(numbers3));
        System.out.println(solution(numbers4));
        System.out.println(solution(numbers5));
        //solution(numbers2);
        /*String a = "10";
        String b = "";
        System.out.println(a.length());
        //b =a.indexOf(0,1);
        System.out.println(a.substring(1,2));
        List<Integer> numberLists1 = Arrays.stream(numbers1).boxed().collect(Collectors.toList());
        numberLists1.stream().forEach(c -> System.out.print(c));*/

    }

    public static String solution(int[] numbers) {
        Arrays.sort(numbers);
        String answer = "";
        List<Integer> numberLists = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int criteria = 0;
        for(int i=numberLists.size() -1; i>=0; i--){
            criteria = 0;
            int removeIndex = 0;
            for(int j=i; j>=0; j--){

                int nowNumber = numberLists.get(j);
                boolean check = true;
                if(criteria !=0){
                    check = compare(criteria, nowNumber);
                }
                if(check){
                    criteria = nowNumber;
                    removeIndex = j;
                }
            }
            if(!answer.equals("0") || numberLists.get(removeIndex) != 0){
                answer += numberLists.get(removeIndex);
            }
            numberLists.remove(removeIndex);
        }


        return answer;
    }

    public static boolean compare(int criteria, int nowNumber){
        String stringCriteria = Integer.toString(criteria);
        String stringNowNumber = Integer.toString(nowNumber);

        if(Integer.parseInt(stringCriteria+stringNowNumber) >= Integer.parseInt(stringNowNumber+stringCriteria)){
            return false;
        }else{
            return true;
        }
    }

}
