import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        return Math.min(set.size(), nums.length/2);
    }
}