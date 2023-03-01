package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 백준2935번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(br.readLine());
        String b = br.readLine();
        BigInteger c = new BigInteger(br.readLine());

        if("+".equals(b)) {
            System.out.println(a.add(c));
        } else {
            System.out.println(a.multiply(c));
        }
    }
}
