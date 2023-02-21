package 백준;

import java.util.Scanner;

public class 백준1547번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int c = 1;

        for (int i = 0; i < a; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x == c) { // x가 c 와 같으면 c 에 y 값을 대입
                c = y;
            } else if (y == c) { // y가 c랑 같으면 c 에 x 값을 대입
                c = x;
            }

        }
        System.out.println(c);
    }
}
