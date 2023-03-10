class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6){
            try{
                int num = Integer.parseInt(s);
                        return true;
            } catch (NumberFormatException e){
                return false;
            }
        }
        return false;
    }
}