class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder("0");

        for (int i = food.length-1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb = new StringBuilder(String.valueOf(i)).append(sb.append(new StringBuilder(String.valueOf(i))));
            }
        }

        return sb.toString();
    }
}