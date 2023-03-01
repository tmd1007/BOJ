class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");
        
        int answer = Integer.parseInt(strArr[0]);
        
        for(int i =1; i < strArr.length; i++){
            if(strArr[i].equals("Z")) {
                answer -= Integer.parseInt(strArr[i-1]);
            } else
                answer += Integer.parseInt(strArr[i]);
        }
        
        
        return answer;
    }
}