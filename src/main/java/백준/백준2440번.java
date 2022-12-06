package 백준;

import java.util.Scanner;

public class 백준2440번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i=0; i<a; i++) {
            for(int d = a; d>i; d--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
