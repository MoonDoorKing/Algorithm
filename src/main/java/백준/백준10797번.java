package 백준;

import java.util.Scanner;

public class 백준10797번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        in.nextLine();
        String b = in.nextLine();
        String[] c = b.split(" ");
        int cnt = 0;

        for(int i=0; i<c.length; i++) {
            if(a == Integer.parseInt(c[i])) {
                cnt++;;
            }
        }
        System.out.println(cnt);
    }
}
