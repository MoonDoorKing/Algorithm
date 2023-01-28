package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준11365번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine(); // 문자열을 받아오고
            if(s.equals("END")) /// END 문자를 만나면 끝
                break;

            StringBuilder sb = new StringBuilder(s);
            String reverse = sb.reverse().toString();

            System.out.println(reverse);
        }
    }
}
