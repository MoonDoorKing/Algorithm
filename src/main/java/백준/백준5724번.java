package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준5724번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int a = Integer.parseInt(br.readLine());

            int result = 0;

            if(a==0) break;

            for(int i=1; i<=a; i++) {
                result += i*i;
            }
            System.out.println(result);
        }


    }
}
