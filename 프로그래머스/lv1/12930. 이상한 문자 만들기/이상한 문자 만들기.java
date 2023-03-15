class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                if (idx % 2 == 0){
                    sb.append(Character.toString(s.charAt(i)).toUpperCase());
                    idx++;
                } else {
                    sb.append(Character.toString(s.charAt(i)).toLowerCase());
                    idx++;
                }
            } else{
                sb.append(s.charAt(i));
                idx = 0;
            }
        }

        return sb.toString();
    }
}