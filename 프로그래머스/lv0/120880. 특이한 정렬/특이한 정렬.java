
class Solution {
    public int[] solution(int[] numlist, int n) {

        for (int i = 0; i < numlist.length-1; i++) {
            for (int j = i+1; j < numlist.length; j++) {
                int temp = numlist[j];
                int temp2 = numlist[i];
                if (Math.abs(numlist[i] - n) > Math.abs(numlist[j] - n)) {
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                } else if (Math.abs(numlist[i] - n) == Math.abs(numlist[j] - n) && numlist[i] < numlist[j]){
                    numlist[i] = numlist[j];
                    numlist[j] = temp2;
                }
            }
        }


        return numlist;
    }
}