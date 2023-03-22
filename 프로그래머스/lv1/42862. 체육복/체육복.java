import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] stuArr = new int[n+2];

        Arrays.fill(stuArr, 1);
        stuArr[0] = 0;
        stuArr[stuArr.length-1] = 0;

        for (int stu : lost) {
            stuArr[stu] -= 1;
        }

        for (int stu : reserve) {
            stuArr[stu] += 1;
        }

        for (int i = 1; i < stuArr.length-1; i++) {
            if (stuArr[i] == 0){
                if(stuArr[i-1] == 2) {
                    stuArr[i - 1] -= 1;
                    stuArr[i] += 1;
                } else if (stuArr[i+1] == 2) {
                    stuArr[i+1] -= 1;
                    stuArr[i] += 1;
                }
            }
            
            if (stuArr[i] > 0)
                answer++;
        }
        
        return answer;
    }
}