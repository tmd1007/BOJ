class Solution {
    public long solution(int a, int b) {
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        return (long) (x + y) * (x - y + 1) / 2;
    }
}