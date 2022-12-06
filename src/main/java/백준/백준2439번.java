package 백준;

import java.util.Scanner;

public class 백준2439번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();

        for(int i=1; i <= a; i++) {
            for(int d = 1; d <= a - i; d++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
