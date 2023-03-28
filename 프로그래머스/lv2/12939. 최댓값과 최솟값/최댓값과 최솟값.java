import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int[] numArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(numArr);
        
        String str = String.valueOf(numArr[0]).concat(" ").concat(String.valueOf(numArr[numArr.length-1]));
        return str;
    }
}