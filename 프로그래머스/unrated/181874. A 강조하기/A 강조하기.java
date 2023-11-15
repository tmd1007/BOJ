class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a') {
                arr[i] = 'A';
            } else if (arr[i] != 'A' && Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        
        return String.valueOf(arr);
    }
}