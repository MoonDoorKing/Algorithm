package 백준;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class 백준2547번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i=0; i<a; i++) {
            BigInteger sum = new BigInteger("0");
            int b = in.nextInt();

            for(int j=0; j<b; j++) {
                sum = sum.add(in.nextBigInteger());
            }

            String c = String.valueOf(sum.remainder(BigInteger.valueOf(b)));
            if ("0".equals(c))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
