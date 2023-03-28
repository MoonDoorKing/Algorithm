package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준20499번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split("/");

        if(Integer.parseInt(a[0]) + Integer.parseInt(a[2]) < Integer.parseInt(a[1]) || a[1].equals("0")) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}
