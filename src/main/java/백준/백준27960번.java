package 백준;

import java.util.Scanner;

public class 백준27960번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int c = 0;

        int max = 512;

        while(max > 0) {
            int cnt = 0;

            if(a>=max) {
                cnt++;
                a-=max;
            }
            if(b>=max) {
                cnt++;
                b-=max;
            }
            if(cnt==1) c += max;

            max >>= 1;
        }
        System.out.println(c);
    }
}
