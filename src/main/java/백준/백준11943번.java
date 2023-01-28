package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준11943번 {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();

        System.out.println(Math.min(a + d, b + c));
    }
}
// 비어있는 상자가 없기 때문에 사과 A개와 오렌지 D개를 옮기거나 사과 C개와 오렌지 B개를 옮기는 수밖에 없습니다. 둘 중 적은 수를 고르면 됩니다.