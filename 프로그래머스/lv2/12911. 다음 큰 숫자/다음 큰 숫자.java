class Solution {
    public int solution(int n) {
        int x = Integer.bitCount(n);

        while(Integer.bitCount(++n) != x){

        }

        return n;
    }
}