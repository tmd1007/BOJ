class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        if (Character.isLowerCase(charArr[0])) {
            sb.append(Character.toUpperCase(charArr[0]));
        } else {
            sb.append(charArr[0]);
        }

        for (int i = 1; i < charArr.length; i++) {
            char c = charArr[i];
            if (charArr[i-1] == ' ') {
                sb.append(Character.toUpperCase(c));
            } else if (charArr[i-1] != ' '){
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}