package 백준;

import java.util.Scanner;

public class 백준5524번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i=0;i<=a;i++) {
            String name = in.nextLine().toLowerCase();
            System.out.println(name);
        }
    }
}
