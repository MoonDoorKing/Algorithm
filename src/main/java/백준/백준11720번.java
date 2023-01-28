package 백준;

import java.util.Scanner;

public class 백준11720번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        String b = in.next(); // 정수가 아닌 String (문자열)로 입력을 받는다.

        int sum = 0;

        for(int i=0; i<a; i++) { //for 문을 통해 입력받은 문자열의 첫번째 원소 ( charAt(0) ) 부터 마지막 원소 ( charAt(N) ) 까지 각 원소의 누적 합을 구하면 된다.
            sum += b.charAt(i) - 48; // charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
        }
        System.out.print(sum);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        br.readLine();
//
//        int sum = 0;
//
//        for(byte value : br.readLine().getBytes()) {
//            sum += (value - '0');	// 또는 (a-48)
//        }
//
//        System.out.print(sum);
    }
}
