class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] strArr = dartResult.split("(?<=\\D)(?=\\d)");
        int[] numArr = new int[3];

        numArr[0] = conversion(strArr[0]);
        if (strArr[0].contains("*")) {
            numArr[0] *= 2;
        }else if (strArr[0].contains("#")){
            numArr[0] *= -1;
        }

        for (int i = 1; i < strArr.length; i++) {
            numArr[i] = conversion(strArr[i]);

            if (strArr[i].contains("*")) {
                numArr[i - 1] *= 2;
                numArr[i] *= 2;
            }else if (strArr[i].contains("#")){
                numArr[i] *= -1;
            }
        }

        for (int e : numArr) {
            answer += e;
        }
        return answer;
    }

    public static int conversion(String str) {
        int result;
        String num = str.replaceAll("[^0-9]", "");
        int one = Integer.parseInt(num);
        int two;
        if (str.contains("S")){
            two = 1;
        } else if (str.contains("D")) {
            two = 2;
        } else two = 3;

        result = (int) Math.pow(one, two);

        return result;
    }
}