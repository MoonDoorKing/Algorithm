package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준5543번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int burger = Math.min(a,b);
        int burger2 = Math.min(burger,c);
        int coke = Math.min(d,e);

        System.out.println(burger2+coke-50);
    }
}
