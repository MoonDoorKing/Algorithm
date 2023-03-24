package 백준;

import java.util.Scanner;

public class 백준17388번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] uni = new int[3];

        uni[0] = in.nextInt();
        uni[1] = in.nextInt();
        uni[2] = in.nextInt();

        int min = 0;
        int result = 0;
        if(uni[0] + uni[1] + uni[2] >= 100) {
            System.out.println("OK");
        } else {
            min = Math.min(uni[0],uni[1]);
            result = Math.min(min,uni[2]);
            for(int i=0; i<uni.length; i++) {
                if(result == uni[i]) {
                    if(i==0) {
                        System.out.println("Soongsil");
                    } else if (i==1) {
                        System.out.println("Korea");
                    } else {
                        System.out.println("Hanyang");
                    }
                }
            }
        }
    }
}

//    int S = Integer.parseInt(st.nextToken());
//    int K = Integer.parseInt(st.nextToken());
//    int H = Integer.parseInt(st.nextToken());
//
//    int i[] = {S, K, H};
//        Arrays.sort(i);
//
//                if(S + K + H >= 100) System.out.println("OK");
//                else if (i[0]==S) System.out.println("Soongsil");
//                else if (i[0]==K) System.out.println("Korea");
//                else System.out.println("Hanyang");