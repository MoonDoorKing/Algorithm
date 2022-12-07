package 백준;

import java.util.Scanner;

public class 백준4470번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        for (int i=0; i<num; i++) {
            System.out.println((i+1)+". " + in.nextLine());
        }
        in.close();
    }
}
