package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2443번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());


        for(int i=1; i<=a; i++) {
            for(int d=1; d<i; d++) {
                System.out.print(" ");
            }
            for(int j=(2*a)-(i*2-1); j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
