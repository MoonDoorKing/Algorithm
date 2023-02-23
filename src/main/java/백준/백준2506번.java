package 백준;

import java.util.Scanner;

public class 백준2506번 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int[] b = new int[a];

        for(int i=0; i < a; i++) {
            b[i] = in.nextInt();
        }

        int cnt = 0;
        int sum = 0;

        for(int i=0; i< a; i++) {
            if(b[i] == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        System.out.println(sum);
    }
}
