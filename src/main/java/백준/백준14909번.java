package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준14909번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");

        int cnt = 0;
        for(int i=0; i<a.length; i++) {
            if(Integer.parseInt(a[i]) > 0) cnt++;
        }

        System.out.println(cnt);
    }
}
