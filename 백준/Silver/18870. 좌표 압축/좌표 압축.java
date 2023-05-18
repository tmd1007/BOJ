import java.io.IOException;
import java.util.HashMap;

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


    public static void heapSort(int[] arr) {
        // 힙으로 재구성 (maxHeap 기준, 마지막 부모 노드부터)
        for(int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }

        // maxHeap 기준 root 쪽을 끝 쪽으로 보내면서 재정렬 -> 오름차순
        for(int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    public static void heapify(int[] arr, int parentIdx, int size) {
        // 자식 노드 위치
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int maxIdx = parentIdx;

        // 왼쪽 자식 노드가 크면 maxIdx 를 해당 인덱스로 교체
        if(leftIdx < size && arr[maxIdx] < arr[leftIdx]) {
            maxIdx = leftIdx;
        }

        // 오른쪽 자식 노드가 크면 maxIdx 를 해당 인덱스로 교체
        if(rightIdx < size && arr[maxIdx] < arr[rightIdx]) {
            maxIdx = rightIdx;
        }

        // maxIdx 가 바뀐 경우, 부모 노드가 교체되는 것을 의미
        // 교체하고 서브 트리 검사 하도록 재귀 호출
        if(parentIdx != maxIdx) {
            swap(arr, maxIdx, parentIdx);
            heapify(arr, maxIdx, size);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) throws IOException {
        int N = read();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int n = read();
            arr[i] = n;
        }

        int[] arrSort = arr.clone();

        HashMap<Integer, Integer> map = new HashMap<>();

        heapSort(arrSort);

        for (int j : arrSort) {
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