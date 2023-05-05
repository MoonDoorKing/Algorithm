package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 백준2145번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        while (true) {
            String a = br.readLine();

            if("0".equals(a)) break;

            String[] b = a.split("");

            result(b);
        }
    }
    // 재귀 함수 ..
    static void result(String[] b) {
        int num = 0;

        for(int i=0; i<b.length; i++) {
            num += Integer.parseInt(b[i]);
        }

        if(num/10==0)
            System.out.println(num);
        else
            result(String.valueOf(num).split(""));
    }
}
