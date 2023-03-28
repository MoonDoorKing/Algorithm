package 백준;

import java.util.Scanner;

public class 백준23795번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long sum = 0;

        while (true) {
            long a = in.nextLong();
            if(a == -1)
                break;

            sum += a;
        }
        System.out.println(sum);
    }
}
