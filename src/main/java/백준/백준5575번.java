package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준5575번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++) {
            String[] a = br.readLine().split(" ");

            int start = (Integer.parseInt(a[0]) * 3600) + (Integer.parseInt(a[1]) * 60) + Integer.parseInt(a[2]);
            int end = (Integer.parseInt(a[3]) * 3600) + (Integer.parseInt(a[4]) * 60) + Integer.parseInt(a[5]);

            int time = end - start;
            int h = time / 3600;
            int m = (time % 3600) / 60;
            int s = (time % 3600) % 60;

            System.out.println(h + " " + m + " " + s);
        }
    }
}
