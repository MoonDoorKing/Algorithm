package 백준;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 백준3058번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int[] b = new int[7];

        for (int i = 0; i < a; i++) {
            int result = 0;
            int min = 101;

            for (int d = 0; d < 7; d++) {
                b[d] = in.nextInt();

                if (b[d] % 2 == 0) {
                    result += b[d];
                    if (b[d] < min) {
                        min = b[d];
                    }
                }
            }
            System.out.println(result + " " + min);
        }
    }
}
