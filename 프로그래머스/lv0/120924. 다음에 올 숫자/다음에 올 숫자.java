class Solution {
    public int solution(int[] common) {
        int n1 = common[1] - common[0];
        int n2 = common[2] - common[1];
        
        if(n1 == n2)
            return common[common.length-1] + n1;
        else 
            return common[common.length-1] * (common[1] / common[0]);
    }
}