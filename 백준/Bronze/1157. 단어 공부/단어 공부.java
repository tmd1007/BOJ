import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toUpperCase();
        int[] numArr = new int[128];
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            numArr[charArr[i]]++;
        }

        int max = 0;
        int idx = 0;
        boolean chk = false;

        for (int i = 0; i < numArr.length; i++) {
            if (max < numArr[i]){
                max = numArr[i];
                idx = i;
                chk = false;
            } else if (max == numArr[i])
                chk = true;
        }

        if (chk)
            bw.write("?");
        else bw.write((char) idx);

        bw.close();
    }
}