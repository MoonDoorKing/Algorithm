package 백준;

import java.util.Scanner;

public class 백준9325번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i=0; i<a; i++) {
            int result = 0;

            result = in.nextInt();
            int b = in.nextInt();

            for(int d=0; d<b; d++) {
                int one = in.nextInt();
                int two = in.nextInt();

                result += one * two;
            }
            System.out.println(result);
        }
    }
}
