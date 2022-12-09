package 백준;

import java.util.Scanner;

public class 백준5532번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int L = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        if(A/C < B/D) {
            if(B%D != 0) {
                System.out.println(L-B/D-1);
            } else {
                System.out.println(L-B/D);
            }
        } else {
            if(A%C != 0) {
                System.out.println(L-A/C-1);
            } else {
                System.out.println(L-A/C);
            }
        }
    }
}
