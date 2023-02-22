package 백준;

import java.util.Scanner;

public class 백준2442번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i=1; i<=a; i++) {

            for(int j=i; j < a; j++) {
                System.out.print(" ");
            }

            for(int d=0; d<i*2-1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
