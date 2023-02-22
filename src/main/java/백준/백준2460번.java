package 백준;

import java.util.Scanner;

public class 백준2460번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int human = 0;
        int cnt = 0;

        for(int i=0; i<10; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            human -= x;
            human += y;

            cnt = Math.max(cnt,human);
        }
        System.out.println(cnt);
    }
}
