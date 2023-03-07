class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int idx;
        int[] arr1 = new int[101];
        int[] arr2 = new int[101];

        idx = 0;
        int[] x = new int[Math.abs(lines[0][0] - lines[0][1])];
        for (int i = lines[0][0]; i < lines[0][1]; i++) {
            x[idx] = i;
            idx++;
        }

        idx = 0;
        int[] y = new int[Math.abs(lines[1][0] - lines[1][1])];
        for (int i = lines[1][0]; i < lines[1][1]; i++) {
            y[idx] = i;
            idx++;
        }

        idx = 0;
        int[] z = new int[Math.abs(lines[2][0] - lines[2][1])];
        for (int i = lines[2][0]; i < lines[2][1]; i++) {
            z[idx] = i;
            idx++;
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j] && x[i] >= 0){
                    arr1[x[i]]++;
                } else if (x[i] == y[j] && x[i] < 0)
                    arr2[-x[i]]++;
            }
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < z.length; j++) {
                if (x[i] == z[j] && x[i] >= 0){
                    arr1[x[i]]++;
                } else if (x[i] == z[j] && x[i] < 0)
                    arr2[-x[i]]++;
            }
        }

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < z.length; j++) {
                if (y[i] == z[j] && y[i] >= 0){
                    arr1[y[i]]++;
                } else if (y[i] == z[j] && y[i] < 0)
                    arr2[-y[i]]++;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] >= 1)
                answer++;
            if(arr2[i] >= 1)
                answer++;
        }

        return answer;
    }
}