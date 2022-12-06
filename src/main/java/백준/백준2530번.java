package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2530번 {
    public static void main(String[] args) throws IOException {
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

          String s = bf.readLine();

          StringTokenizer st = new StringTokenizer(s);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int d = Integer.parseInt(st.nextToken());

        c += d;  // 초에 걸리는 초를 더 해준다.
        b += c/60; // c 를 60으로 나눈 몫을 b 에 더 해준다.
        c %= 60; // c 를 60 으로 나눈 나머지 값을 준다.
        a += b/60; // a 에 b 를 60으로 나눈 값을 준다.
        b %= 60; // b 에 60으로 나눈 나머지 값을 준다.
        a %= 24; // 24가 넘어가면 0이 되어야 하기 때문에 24로 나눈 나머지 값을 준다.

        System.out.println(a + " " + b + " " + c);

    }
}
