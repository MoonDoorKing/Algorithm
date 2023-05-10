package 백준;

import java.util.Scanner;

public class 백준2702번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i=0; i<a; i++) {
            int c = in.nextInt();
            int d = in.nextInt();
            int e = GCD(c,d);
            System.out.println((c*d / e) + " " + e);
        }
    }

    public static int GCD(int c,int d) {
        if(c % d == 0) return d;

        return GCD(d, c % d);
    }
}
