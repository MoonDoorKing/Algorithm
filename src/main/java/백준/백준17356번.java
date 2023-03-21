package 백준;

import java.util.Scanner;

public class 백준17356번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        double result = 1 / (1 + Math.pow(10,(b-a) / 400.0));
        // 나눌때 400을 나누는 것과 400.0 을 나누는게 결과가 달랐다.

        System.out.println(result);
    }
}
