import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int tmp = arr[j];
                if (arr[i] > arr[j]){
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        int idx = 0;
        int dup = -1;
        int cnt = 0;
        while(idx != 10){
            if (dup != arr[idx]){
                cnt++;
                dup = arr[idx];
            }
            idx++;
        }

        System.out.println(cnt);
    }
}