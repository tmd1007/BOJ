import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, int[]> map = new HashMap<>();
        int[] LEFT = new int[]{3,0};
        int[] RIGHT = new int[]{3,2};
        map.put(0, new int[]{3,1});
        for (int i = 1; i <= 9; i++) {
            int[] idx = {(i-1) / 3,(i-1) % 3};
            map.put(i, idx);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                LEFT = map.get(numbers[i]);
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append("R");
                RIGHT = map.get(numbers[i]);
            } else {
                if (xy(LEFT, map.get(numbers[i])) > xy(RIGHT, map.get(numbers[i]))){
                    sb.append("R");
                    RIGHT = map.get(numbers[i]);
                } else if (xy(LEFT, map.get(numbers[i])) < xy(RIGHT, map.get(numbers[i]))){
                    sb.append("L");
                    LEFT = map.get(numbers[i]);
                } else{
                    if (hand.equals("left")){
                        sb.append("L");
                        LEFT = map.get(numbers[i]);
                    } else {
                        sb.append("R");
                        RIGHT = map.get(numbers[i]);
                    }
                }
            }
        }


        return sb.toString();
    }

    public static int xy(int[] hand, int[] num) {
        int xy = 0;

        for (int i = 0; i < 2; i++) {
            xy += Math.abs(hand[i] - num[i]);
        }

        return xy;
    }
}