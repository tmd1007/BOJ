class Solution {
    boolean solution(String s) {
        int P = 0;
        int Y = 0;
        s = s.toUpperCase();
        
        String[] strArr = s.split("");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("P"))
                P++;
            else if (strArr[i].equals("Y"))
                Y++;
        }
        
        return P == Y;
    }
}