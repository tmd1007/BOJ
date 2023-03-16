import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String str;

        while(true){
            str = br.readLine();
            if (str.equals("0"))
                break;

            int start = 0;
            int end = str.length()-1;
            boolean B = true;

            for (int i = start; i < end; i++) {
                if (str.charAt(i) == str.charAt(end)){
                    start++;
                    end--;
                } else B = false;
            }

            if(B)
                bw.write("yes" + "\n");
            else bw.write("no" + "\n");
        }

        br.close();
        bw.close();
    }
}