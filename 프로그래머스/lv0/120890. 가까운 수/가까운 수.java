import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0]; 

        for (int i = 0; i < array.length -1; i++) {
            if(Math.abs(array[i] - n) > Math.abs(array[i+1] - n))
                answer = array[i+1];
        }
        
        return answer;
    }
}