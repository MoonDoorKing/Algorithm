package 백준;

import java.util.Scanner;

public class 백준2490번 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            int cnt = 0;

            for(int d=0; d<4; d++) {
                int a = in.nextInt();
                if(a==0) {
                    cnt++;
                }
            }

                if (cnt == 0) {
                    System.out.println("D");
                } else if (cnt == 1) {
                    System.out.println("A");
                } else if (cnt == 2) {
                    System.out.println("B");
                } else if (cnt == 3) {
                    System.out.println("C");
                } else {
                    System.out.println("E");
                }
            }
    }
}
