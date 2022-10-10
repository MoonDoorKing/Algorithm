package 백준;

import java.math.BigInteger;
import java.util.Scanner;

public class 백준1271번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

        //BingIntger 사칙연산 메소드 ...
//        덧셈	 Bignumber1.add(Bignumber2)
//        뺄셈	 Bignumber1.subtract(Bignumber2)
//        곱셈	Bignumber1.multiply(Bignumber2)
//        나눗셈	Bignumber1.divide(Bignumber2)
//        나머지	Bignumber1.remainder(Bignumber2)
    }
}
