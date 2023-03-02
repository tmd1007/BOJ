class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int n = code;
        String[] arr = cipher.split("");

        while(code <= arr.length){
            answer = answer.concat(arr[code-1]);

            code += n;
        }

        return answer;
    }
}