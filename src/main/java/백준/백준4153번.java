package 백준;

import java.util.Scanner;

public class 백준4153번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a == 0 && b == 0 && c == 0)
                break;

            if ((a * a + b * b) == c * c)
                System.out.println("right");
            else if (a * a == (b * b + c * c))
                System.out.println("right");
            else if (b * b == (a * a + c * c))
                System.out.println("right");
            else
                System.out.println("wrong");

        }
    }
}
