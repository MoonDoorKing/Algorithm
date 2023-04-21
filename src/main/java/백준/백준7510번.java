package 백준;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 백준7510번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i=1; i<=a; i++) {
            int[] b = new int[3];
            b[0] = in.nextInt();
            b[1] = in.nextInt();
            b[2] = in.nextInt();

            Arrays.sort(b);

            if(Math.pow(b[0],2) + Math.pow(b[1],2) == Math.pow(b[2],2)) {
                System.out.println("Scenario #" + i + ":");
                System.out.println("yes");
                System.out.println();
            } else {
                System.out.println("Scenario #" + i + ":");
                System.out.println("no");
                System.out.println();
            }
        }
    }
}
