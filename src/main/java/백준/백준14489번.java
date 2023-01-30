package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준14489번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int sum = a + b;

        if(sum >= c * 2) {
            System.out.println(sum - c * 2);
        } else {
            System.out.println(sum);
        }
    }
}
