class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        answer[0] = 51;
        answer[1] = 51;
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if  (wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i);
                    answer[3] = Math.max(answer[3], j);
                }
            }
        }
        
        answer[2]++;
        answer[3]++;
        
        return answer;
    }
}