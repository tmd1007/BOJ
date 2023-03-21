import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(n->a[n] * b[n]).sum();
    }
}