class Solution {
    public boolean solution(String s) {

        if ((s.length() == 4 || s.length() == 6) && isNum(s))
            return true;

        return false;
    }

    public static boolean isNum(String n){
        try {
            int num = Integer.parseInt(n);
        } catch (NumberFormatException e){
            return false;
        }

        return true;
    }
}