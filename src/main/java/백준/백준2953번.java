package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준2953번 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int cnt = 0;
        int max = 0;
        int c = 0;

        for(int i=1; i<=5; i++) {
            int one = in.nextInt();
            int two = in.nextInt();
            int three = in.nextInt();
            int four = in.nextInt();

            cnt = one + two + three + four;

            if(cnt > max) {
                c = i;
                max = cnt;
            }

        }
        System.out.println(c +" "+max);

    }
}
// example
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int winner = 1;  // 우승자
//        int total = 0;  // 우승자의 점수
//        for (int i = 1; i <= 5; i++) {
//            st = new StringTokenizer(br.readLine());
//            int current = 0;
//            while (st.hasMoreTokens()) {
//                current += Integer.parseInt(st.nextToken());
//            }
//            //현재 점수가 우승자의 점수보다 높으면
//            if (current > total) {
//                winner = i;
//                total = current;
//            }
//        }
//        System.out.print(winner + " " + total);
//    }
//}
