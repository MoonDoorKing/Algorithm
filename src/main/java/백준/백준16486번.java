package 백준;

import java.util.Scanner;

public class 백준16486번 {
    public static void main(String[] args) {
        // 원의 둘레 반지름 * 2 * 3.14
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        double result = 0;

        result = (b * 2 * 3.141592) + (a * 2);

        System.out.println(result);
    }
}
