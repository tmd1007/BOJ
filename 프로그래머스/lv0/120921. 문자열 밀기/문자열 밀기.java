class Solution {
    public int solution(String A, String B) {
        int answer = 0;

        while(answer<A.length()){
            if(A.equals(B))
                return answer;
            answer++;
            char c = A.charAt(A.length()-1);
            A = A.substring(0,A.length()-1);
            A = String.valueOf(c).concat(A);
        }

        return -1;
    }
}