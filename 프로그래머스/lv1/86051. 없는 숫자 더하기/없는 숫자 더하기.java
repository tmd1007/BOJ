class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            boolean chk = true;
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]){
                    chk = false;
                    break;
                }
            }
            if (chk)
                sum += i;
        }
            
        return sum;
    }
}