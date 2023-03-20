class Solution {
    public int solution(String s) {
        if (s.charAt(0) == '-'){
            s = s.substring(1);
            return Integer.parseInt(s) * -1;
        }   
        else return Integer.parseInt(s);

    }
}