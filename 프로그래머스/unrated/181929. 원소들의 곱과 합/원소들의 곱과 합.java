class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            answer *= num_list[i];
            sum += num_list[i];
        }
        
        if (answer < Math.pow(sum, 2))
            return 1;
        else return 0;
        
    }
}