package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class 백준2997번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        Arrays.sort(a);

        int N = a[1] - a[0];
        int N2 = a[2] - a[1];

        //두 값을 비교 후 해당 값 출력
        if(N == N2) {
            System.out.println(a[2] + N);
        }else if(N < N2) {
            System.out.println(a[1] + N);
        }else {
            System.out.println(a[0] + N2);
        }


    }
}
