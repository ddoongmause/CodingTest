package programmers.sort;

import java.util.Arrays;

public class Sort01 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int answerCount = commands.length;
        int[] answer = new int[answerCount];

        for(int i=0; i<answerCount; i++) {
            int[] devideCommands = commands[i];
            System.out.println(devideCommands[0] + ":" + devideCommands[1]);
            int[] cutDevideCommands = Arrays.copyOfRange(array, devideCommands[0]-1, devideCommands[1]);
            Arrays.sort(cutDevideCommands);
            System.out.println(cutDevideCommands[0]);
            answer[i] = cutDevideCommands[devideCommands[2]-1];
        }


        return answer;
    }
}
