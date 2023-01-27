package 백준;

import java.util.Scanner;

public class 백준10808번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.next();
        int[] alphabet = new int[26];

        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - (int) 'a';
            alphabet[index]++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]+" ");
        }
    }
}
