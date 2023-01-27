package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준10768번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a < 2) // a 가 2보다 작으면 Before 
            System.out.println("Before");
        else if (a == 2) { // a 가 2 와 같으면 
            if (b < 18)
                System.out.println("Before");
            else if(b > 18)
                System.out.println("After");
            else
                System.out.println("Special");
        } else { // a 가 2보다 작지도 같지도 않다면
            System.out.println("After");
        }
    }
}
