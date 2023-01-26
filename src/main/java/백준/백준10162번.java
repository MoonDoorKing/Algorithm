package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준10162번 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int time = sc.nextInt();

        if(time%10 != 0){
            System.out.println("-1");
        }
        else{
            a = time/300;
            time = time%300;
            b = time/60;
            time = time%60;
            c = time/10;

            System.out.println(a + " " + b + " " + c);
        }
    }
}
