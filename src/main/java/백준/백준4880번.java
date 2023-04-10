package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준4880번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] a = br.readLine().split(" ");

            if("0".equals(a[0]) && "0".equals(a[1])) break;

            if(Integer.parseInt(a[2]) - Integer.parseInt(a[1]) == Integer.parseInt(a[1]) - Integer.parseInt(a[0]))
                System.out.println("AP " + (Integer.parseInt(a[2]) + (Integer.parseInt(a[2]) - Integer.parseInt(a[1]))));
            else
                System.out.println("GP " + (Integer.parseInt(a[2]) * (Integer.parseInt(a[2]) / Integer.parseInt(a[1]))));
        }
    }
}
