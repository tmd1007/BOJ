class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        String temp;

        for(int i=0; i < str.length; i++) {
            temp = str[i];
            for(int j = i + 1; j < str.length; j++) {
                if(i != str.length-1 && !temp.equals("") && temp.equals(str[j]))
                    str[j] = "";
            }

            answer = answer.concat(str[i]);
        }


        return answer;
    }
}