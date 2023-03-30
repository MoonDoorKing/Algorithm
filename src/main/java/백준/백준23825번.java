package 백준;

import java.util.Scanner;

public class 백준23825번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long s = in.nextLong();
        long a = in.nextLong();

        long result = Math.min(s/2,a/2);

        System.out.println(result);
    }
}
