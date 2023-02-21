package 백준;

import java.util.Scanner;

public class 백준1284번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            int result = 0;

            String a = in.next();

            if(a.equals("0"))
                break;

            for(String s : a.split("")) {
                if("1".equals(s)) {
                    result += 2;
                } else if ("0".equals(s)) {
                    result += 4;
                } else {
                    result += 3;
                }
            }

            result += 2 + a.length() - 1;

            System.out.println(result);
        }
    }
}
