import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main {
    static int rank;

    private static int read() throws IOException {
        boolean isMinus = false;
        int c, n = System.in.read();
        if (n == 45) {
            isMinus = true;
            n = System.in.read() & 15;
        } else {
            n = n & 15;
        }
        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return isMinus ? -n : n;
    }

    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, tmp, left, mid);
            mergeSort(arr, tmp, mid + 1, right);
            merge(arr, tmp, left, right, mid);
        }
    }

    public static void merge(int[] arr, int[] tmp, int left, int right, int mid) {
        int p = left;
        int q = mid + 1;
        int idx = p;
        // p, q 둘 중 하나는 해당 배열 범위 안에 있는 동안
        while (p <= mid || q <= right) {
            if (p <= mid && q <= right) {   // 둘 다 범위 안인 경우
                if (arr[p] <= arr[q]) { // 값 비교하여 정렬
                    tmp[idx++] = arr[p++];
                } else {
                    tmp[idx++] = arr[q++];
                }
            } else if (p <= mid && q > right) { // 왼쪽만 남은 경우 이어주기
                tmp[idx++] = arr[p++];
            } else {                            // 오른쪽만 남은 경우 이어주기
                tmp[idx++] = arr[q++];
            }
        }

        for (int i = left; i <= right; i++) {   // 정렬된 부분 데이터 arr 쪽으로
            arr[i] = tmp[i];
        }
    }

    public static void main(String[] args) throws IOException {

        int N = read();
        int[] arr = new int[N];
        int[] tmp = new int[N];
        for (int i = 0; i < N; i++) {
            int n = read();
            arr[i] = n;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] sortedArray = arr.clone();

        mergeSort(sortedArray, tmp, 0, N - 1);

        for (int j : sortedArray) {
            if (!map.containsKey(j)) {
                map.put(j, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(map.get(j)).append(' ');
        }

        System.out.println(sb);
    }
}