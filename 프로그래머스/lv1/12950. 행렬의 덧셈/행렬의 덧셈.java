class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int[][] answer = new int[n][arr1[arr1.length-1].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[arr1.length-1].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        
        return answer;
    }
}