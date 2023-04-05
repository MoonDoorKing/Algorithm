package 백준;

import java.io.*;

public class 백준27918번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] b = new int[2];
        for(int i=0; i<a; i++) {
            String c = br.readLine();
            if("D".equals(c)) {
                b[0]++;
            } else if("P".equals(c)) {
                b[1]++;
            }
            if(Math.abs(b[0] - b[1]) == 2)
                break;

        }
        System.out.println(b[0]+":"+b[1]);
    }
}
