import java.util.*;
import java.io.*;

public class Main {
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

    public void mSort(int[] arr) {
        int[] tempArr = new int[arr.length];
        div(arr, tempArr, 0, arr.length - 1);
    }

    public void div(int[] arr, int[] tempArr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            div(arr, tempArr, left, middle);
            div(arr, tempArr, middle + 1, right);

            sor(arr, tempArr, left, middle, right);
        }
    }

    public void sor(int[] arr, int[] tempArr, int left, int middle, int right) {
        for (int i = left; i <= right; i++) {
            tempArr[i] = arr[i];
        }

        int k = left;
        int s = left;
        int e = middle + 1;

        while (s <= middle && e <= right) {
            if (tempArr[s] <= tempArr[e]) {
                arr[k++] = tempArr[s++];
            } else {
                arr[k++] = tempArr[e++];
            }
        }

        while (s <= middle) {
            arr[k++] = tempArr[s++];
        }

        while (e <= right) {
            arr[k++] = tempArr[e++];
        }
    }

    public void solution() throws IOException {
        StringBuilder sb = new StringBuilder();

        int N = read();

        int[] originArr = new int[N];
        int[] copiedArr = new int[N];
        for (int n = 0; n < N; n++) {
            int x = read();
            originArr[n] = copiedArr[n] = x;
        }

        mSort(copiedArr);

        HashMap<Integer, Integer> copedMap = new HashMap<Integer, Integer>();

        int i = 0;
        for (int x : copiedArr) {
            if (!copedMap.containsKey(x)) {
                copedMap.put(x, i++);
            }
        }

        for (int n = 0; n < N; n++) {
            originArr[n] = copedMap.get(originArr[n]);
        }

        for (int n = 0; n < N; n++) {
            sb.append(originArr[n]).append(' ');
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}