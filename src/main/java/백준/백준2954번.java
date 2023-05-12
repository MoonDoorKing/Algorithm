package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2954번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        a = a.replaceAll("(?:([a|e|i|o|u]{1})(p{1})([a|e|i|o|u{1}]))", "$1");
        System.out.println(a);
    }
}
