import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(1,9).sum() - Arrays.stream(numbers).sum();

    }
}