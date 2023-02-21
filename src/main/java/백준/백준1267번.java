package 백준;

import java.util.Scanner;

public class 백준1267번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b;

        int yongSik = 0, minSik = 0;

        for (int i = 1; i <= a; i++) {
            b = in.nextInt();

            yongSik += ((b / 30) + 1) * 10;
            minSik += ((b / 60) + 1) * 15;
        }
        if (yongSik == minSik) {
            System.out.println("Y M " + yongSik);
        } else if (yongSik < minSik) {
            System.out.println("Y " + yongSik);
        } else if (yongSik > minSik) {
            System.out.println("M " + minSik);
        }

    }
}
