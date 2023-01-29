package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준14470번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()); // 고기 온도
        int b = Integer.parseInt(br.readLine()); // 목표 온도
        int c = Integer.parseInt(br.readLine()); // 얼어있는 고기를 1도 데우는데 걸리는 시간
        int d = Integer.parseInt(br.readLine()); // 0도에서 고기가 녹는 시간
        int e = Integer.parseInt(br.readLine()); // 얼어 있지 않은 고기를 데우는 시간

        if(a < 0) {
            System.out.println(((a * -1) * c) + d + (b * e));
        } else {
            System.out.println((b - a) * e);
        }
    }
}
