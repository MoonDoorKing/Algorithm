package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준13866번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");

        int[] total = new int[]{Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3])};

        Arrays.sort(total);

        int c = total[0] + total[3];
        int d = total[1] + total[2];

        System.out.println(Math.abs(c-d));
    }
}
