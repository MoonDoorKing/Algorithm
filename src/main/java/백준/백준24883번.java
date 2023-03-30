package 백준;

import java.io.*;

public class 백준24883번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine().toLowerCase();

        if("n".equals(a))
            bw.write("Naver D2");
        else
            bw.write("Naver Whale");

        br.close();
        bw.close();
    }
}
