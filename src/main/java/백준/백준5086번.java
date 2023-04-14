package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준5086번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a == 0 && b == 0) break;

            if (b % a == 0)
                System.out.println("factor");
            else if (a % b == 0)
                System.out.println("multiple");
            else
                System.out.println("neither");
        }
    }
}
