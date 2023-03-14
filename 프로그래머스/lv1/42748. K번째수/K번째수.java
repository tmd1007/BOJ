import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = target(array, commands[i]);
        }

        return answer;
    }

    public static int target(int[] arr, int[] arr2) {
        int idx = 0;
        int[] numArr = new int[arr2[1] - arr2[0] + 1];

        for (int i = arr2[0]-1; i < arr2[1]; i++) {
            numArr[idx] = arr[i];
            idx++;
        }

        Arrays.sort(numArr);

        return numArr[arr2[2]-1];
    }
}