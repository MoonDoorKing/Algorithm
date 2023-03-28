package 백준;

import java.util.Scanner;

public class 백준19944번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        if(m == 1 || m == 2) {
            System.out.println("NEWBIE!");
        } else if (n >= m) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}
