import java.util.HashSet;
import java.util.Iterator;

class Solution {

    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int cnt = 0;
        // 1. 재귀를 통해 numbers를 이용한 수를 set에 저장
        recursive("", numbers);

        // 2. set의 원소들 소수판별(에라토스테네스의 체)
        for (int n : set) {
            if (isPrime(n)) {
                cnt++;
            }
        }

        // 3. 소수의 개수 반환
        return cnt;
    }

    public void recursive(String str, String others) {
        if (!str.equals("")) {
            set.add(Integer.parseInt(str));
        }

        for (int i = 0; i < others.length(); i++) {
            recursive(str + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    public boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}