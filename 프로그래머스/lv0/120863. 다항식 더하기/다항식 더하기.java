class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replaceAll(" ", "");
        String[] strArr = polynomial.split("[+]");
        int X = 0;
        int N = 0;
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("x"))
                strArr[i] = "1x";
            if(strArr[i].contains("x"))
                X += Integer.parseInt(strArr[i].substring(0,strArr[i].length()-1));
            else N += Integer.parseInt(strArr[i]);
        }

        if(X == 1 && N > 0)
            answer = answer.concat("x + ").concat(String.valueOf(N));
        else if(X == 1 && N == 0)
            answer = answer.concat("x");
        else if(X > 0 && N > 0)
            answer = answer.concat(String.valueOf(X)).concat("x + ").concat(String.valueOf(N));
        else if (X == 0 && N > 0 )
            answer = answer.concat(String.valueOf(N));
        else if (X > 0 && N == 0)
            answer = answer.concat(String.valueOf(X)).concat("x");

        return answer;
    }
}