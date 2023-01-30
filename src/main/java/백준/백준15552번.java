package 백준;

import java.io.*;

public class 백준15552번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            String[] b = br.readLine().split(" ");
            bw.write((Integer.parseInt(b[0])+ Integer.parseInt(b[1]))+ "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
