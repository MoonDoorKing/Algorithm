package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준10156번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int price = in.nextInt();
        int number = in.nextInt();
        int money = in.nextInt();

        int result = price * number < money ? 0 : Math.abs(price * number - money);

        System.out.println(result);
    }
}
