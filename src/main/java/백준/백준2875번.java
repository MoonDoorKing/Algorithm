package 백준;

import java.util.Scanner;

public class 백준2875번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i;

        for(i = b; i >= 0; i--) {
            if((2 * i) <= a && ((a + b) - 3 * i) >= c)
                break;
        }
        System.out.println(i);  // 다시 보기
    }
}
