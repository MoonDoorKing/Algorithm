package 백준;

import java.util.Scanner;

public class 백준2476번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int max = 0;
        int pay = 0;

        for (int i = 0; i < a; i++) {
            int one = in.nextInt();
            int two = in.nextInt();
            int three = in.nextInt();

            if (one == two && two == three) {
                pay = 10000 + one * 1000;
            } else if (one == two) {
                pay = 1000 + one * 100;
            } else if (two == three) {
                pay = 1000 + two * 100;
            } else if (three == one) {
                pay = 1000 + three * 100;
            } else {
                pay = Math.max(one, Math.max(two, three)) * 100;
            }
            max = Math.max(max,pay);

        }
        System.out.println(max);
    }
}
