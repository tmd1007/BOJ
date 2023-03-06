import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int[] w = {dots[0][0], dots[1][0], dots[2][0], dots[3][0]};
        int[] h = {dots[0][1], dots[1][1], dots[2][1], dots[3][1]};

        Arrays.sort(w);
        Arrays.sort(h);

        int width = Math.abs(w[0] - w[3]);
        int height = Math.abs(h[0] - h[3]);

        return width * height;

    }
}