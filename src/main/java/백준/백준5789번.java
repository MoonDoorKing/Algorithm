package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준5789번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++) {
            String b = br.readLine();

            char c = b.charAt(b.length()/2-1);
            char d = b.charAt(b.length()/2);

            if(c==d)
                System.out.println("Do-it");
            else
                System.out.println("Do-it-Not");
        }
    }
}
