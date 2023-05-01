package 백준;

import java.util.Scanner;

public class 백준14656번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int result = 0;

        for(int i=1; i<=a; i++) {
            int c = in.nextInt();
            if(i!=c) result++;
        }
        System.out.println(result);
    }
}
