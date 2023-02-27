package 백준;

import java.util.Scanner;

public class 백준2783번 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();	// X원
        int Y = in.nextInt();	// Y그램
        int N = in.nextInt();	// 편의점 갯수
        double minPrice = (double)X/Y * 1000;	// 1그램의 가격을 구한 뒤 1000을 곱해서 1000그램의 가격을 변수에 할당


        for(int i=0; i<N; i++) {
            int X1 = in.nextInt();	// 가격
            int Y1 = in.nextInt();	// 그램
            double price = (double)X1/Y1 * 1000;
            minPrice = Math.min(minPrice, price);
        }

        System.out.println(minPrice);
    }
}
