package 프로그래머스;

import java.util.Scanner;

public class 직각삼각형출력하기 {
    public class Solution {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i=0; i<n; i++) {
                for(int d = 0; d<=i; d++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
