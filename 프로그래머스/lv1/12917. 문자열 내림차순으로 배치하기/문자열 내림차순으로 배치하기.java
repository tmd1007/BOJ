import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();

        int[] numArr = new int[s.length()];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = -charArr[i];
        }
        
        Arrays.sort(numArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char)-numArr[i];
            sb.append(charArr[i]);
        }
        
        return sb.toString();
    }
}
