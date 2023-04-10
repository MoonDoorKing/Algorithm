package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준4766번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());

        while(true) {
            double d = Double.parseDouble(br.readLine());

            if(d == 999) break;

            System.out.printf("%.2f", d-a);
            System.out.println();

            a = d;

        }
    }
}
