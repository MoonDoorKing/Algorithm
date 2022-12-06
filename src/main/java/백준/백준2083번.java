package 백준;

import java.util.Scanner;

public class 백준2083번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            String str = in.next();
            int age = in.nextInt();
            int weight = in.nextInt();

            if(str.equals("#") && age == 0 && weight == 0) {
                break;
            }

            if(age > 17 || weight >= 80) {
                System.out.println(str+" Senior");
            }else {
                System.out.println(str+" Junior");
            }
        }
    }
}
