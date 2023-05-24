class Solution {

    int[] answer = {0, 0};
    int size;
    int[][] arr;

    public int[] solution(int[][] arr) {
        this.arr = arr;
        size = arr.length;
        solv(0, 0, size);
        return answer;
    }

    public void solv(int x, int y, int size) {
        if (chk(x, y, size)) {
            answer[arr[x][y]]++;
        } else {
            int div = size / 2;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    solv(i * div + x, j * div + y, div);
                }
            }
        }
    }

    public boolean chk(int x, int y, int size) {
        int start = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (start != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}