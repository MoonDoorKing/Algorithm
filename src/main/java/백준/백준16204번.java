package 백준;

import java.util.Scanner;

public class 백준16204번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        // n 은 총 갯수
        // m 은 O 가 그려짐
        // n-m 은 X 의 갯수
        // O는 K 개 X 는 N-K 개

        int min = Math.min(m, k) + Math.min(n-m, n-k);
        System.out.println(min);
    }
}
