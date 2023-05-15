public class Main {
    
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {

        N = read();
        M = read();
        int[] arr = new int[N+1];

        for(int i=1 ;i<=N; i++) {
            arr[i] = arr[i-1] + read();
        }

        for(int k=0; k<M; k++) {
            int i = read();
            int j = read();
            sb.append(arr[j] - arr[i-1]).append('\n');
        }

        System.out.println(sb);

    }

    private static int read() throws Exception{
        int c, n = System.in.read() & 15;

        while((c=System.in.read()) > 32) {
            n = (n<<3) + (n<<1) + (c&15);
        }

        return n;
    }
}