class Solution {
    public int solution(String s) {
        int cnt = 0;
        char firstC;
        int first;
        int other;
        int idx = 0;
        while(idx < s.length()){
            cnt++;
            firstC = s.charAt(idx);
            first = 1;
            other = 0;
            while(++idx < s.length()) {
                if (s.charAt(idx) == firstC){
                    first++;
                } else{
                    other++;
                }
                if (first == other){
                    idx++;
                    break;
                }
            }
        }
        return cnt;
    }
}