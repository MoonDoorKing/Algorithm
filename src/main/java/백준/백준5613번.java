package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준5613번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int result = in.nextInt();

        while(true) {
            String a = in.next();

            if("=".equals(a)) break;

            switch (a) {
                case "+":
                    result += in.nextInt();
                    break;

                case "-":
                    result -= in.nextInt();
                    break;

                case "/":
                    result /= in.nextInt();
                    break;

                case "*":
                    result *= in.nextInt();
                    break;
            }
        }
        System.out.println(result);
    }
}
