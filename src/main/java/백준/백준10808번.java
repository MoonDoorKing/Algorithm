package 백준;

import java.util.Scanner;

public class 백준10808번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.next();
        int[] alphabet = new int[26]; // 알파벳 저장 배열

        for (int i = 0; i < S.length(); i++) {
            alphabet[S.charAt(i)-97]++; // 개수 1개씩 늘려주기
        }
        for(int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]+" ");
        }
    }
}
