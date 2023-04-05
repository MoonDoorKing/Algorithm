package 백준;

import java.io.*;
import java.util.Scanner;

public class 백준27110번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int[] b = new int[3];

        int a = in.nextInt();
        b[0] = in.nextInt();
        b[1] = in.nextInt();
        b[2] = in.nextInt();

        int result = 0;

        for(int i=0; i<b.length; i++) {
            if(a >= b[i]) {
                result += b[i];
            } else {
                result += a;
            }
        }
        System.out.println(result);
    }
}
