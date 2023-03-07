class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for (int i = 0; i <min+max; i++) {
            if(i+min > max && i <= max)
                answer++;
            else if(min+max > i && i > max)
                answer++;
        }

        return answer;
    }
}