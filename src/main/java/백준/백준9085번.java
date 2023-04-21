package 백준;

import java.util.Scanner;

public class 백준9085번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int result = 0;

        for(int i=0; i<a; i++) {
            int b = in.nextInt();
            result = 0;
            for(int d=0; d<b; d++) {
                result += in.nextInt();
            }
            System.out.println(result);
        }
    }
}
