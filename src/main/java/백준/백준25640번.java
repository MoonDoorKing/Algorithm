package 백준;

import java.io.*;

public class 백준25640번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        int b = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i=0; i<b; i++) {
            String c = br.readLine();

            if(c.equals(a)) result++;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
