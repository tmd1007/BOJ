class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");

        String temp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = temp;

        for (int i = 0; i < strArr.length; i++) {
            answer = answer.concat(strArr[i]);
        }


        return answer;
    }
}