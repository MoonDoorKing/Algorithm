package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준16199번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int y1 = Integer.parseInt(a[0]);
        int m1 = Integer.parseInt(a[1]);
        int d1 = Integer.parseInt(a[2]);

        int y2 = Integer.parseInt(b[0]);
        int m2 = Integer.parseInt(b[1]);
        int d2 = Integer.parseInt(b[2]);

        if (y1 == y2) { // 연도가 같으면
            System.out.println(y2 - y1);
        } else {
            if (m1 > m2) { // 생년월일의 월이 더 크면
                System.out.println(y2 - y1 - 1);
            } else if (m1 == m2) { // 월이 같으면
                if (d1 <= d2) { // 기준일의 일이 더 크면
                    System.out.println(y2 - y1);
                } else {
                    System.out.println(y2 - y1 - 1);
                }
            } else {
                System.out.println(y2 - y1);
            }
        }
        System.out.println(y2 - y1 + 1);
        System.out.println(y2 - y1);
    }
}
