class Solution {
    public String solution(String s, String skip, int index) {
        char c = 'a';
        String[] charList = new String[26 - skip.length()];
        String[] strArr = s.split("");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charList.length; i++) {
            if (!skip.contains(String.valueOf(c))){
                charList[i] = String.valueOf(c);
            } else i--;
            c++;
        }

        for (int i = 0; i < strArr.length; i++) {
            int num = idx(charList, strArr[i]) + index;
            while(num >= charList.length){
                num -= charList.length;
            }
            strArr[i] = charList[num];
            sb.append(strArr[i]);
        }

        return sb.toString();
    }

    public static int idx(String[] arr, String s)  {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(s)) {
                return i;
            }
        }
        return idx;
    }
}