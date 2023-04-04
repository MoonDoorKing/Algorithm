package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준26068번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i=0; i<a; i++) {
            String b = br.readLine();
            b = b.replaceAll("D-","");

            if(Integer.parseInt(b) <= 90) {
                result++;
            }
        }
        System.out.println(result);
    }
}
