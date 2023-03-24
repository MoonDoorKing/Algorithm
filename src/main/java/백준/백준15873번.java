package 백준;

import java.io.*;

public class 백준15873번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        int sum = 0;

        while(a.contains("10")) { // a 에 10이 포함되어 있을 경우
            a = a.replaceFirst("10", "");  // 10을 없앰
            sum += 10;
        }

        for(int i=0; i<a.length(); i++) {
            sum += Integer.parseInt(a.substring(i , i+1));
        }

        System.out.println(sum);
    }
}
