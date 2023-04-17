package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준5691번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while(true) {
            int a = in.nextInt(); int b = in.nextInt();
            int c = b-a;

            if(a==0 && b==0) break;

            System.out.println(a-c);
        }
    }
}
