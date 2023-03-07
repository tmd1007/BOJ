class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double x = Math.abs(dots[0][0] - dots[1][0]);
        double y = Math.abs(dots[0][1] - dots[1][1]);
        double z = Math.abs(dots[2][0] - dots[3][0]);
        double w = Math.abs(dots[2][1] - dots[3][1]);
        
        if(x/y == z/w)
            answer = 1;
        
        return answer;
    }
}