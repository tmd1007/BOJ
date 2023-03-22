class Solution {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ')
                continue;
            if (charArr[i] >= 'A' && charArr[i] <= 'Z'){
                charArr[i] += n;
                if (charArr[i] > 'Z')
                    charArr[i] -= 26;
            } else charArr[i] += n;
            
            if (charArr[i] > 'z')
                charArr[i] -= 26;
        }

        return new String(charArr);
    }
}