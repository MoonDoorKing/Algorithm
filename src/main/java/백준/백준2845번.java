package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준2845번 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(bf2.readLine());

        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());
        int e = Integer.parseInt(st2.nextToken());
        int f = Integer.parseInt(st2.nextToken());
        int g = Integer.parseInt(st2.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(c,d,e,f,g));

        for (Integer integer : arrayList) {
            System.out.print(integer - (a * b) + " ");
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c  = a * b;
//        int correct = 0;
//
//        for (int i=0; i < 5; i++) {
//            int d = sc.nextInt();
//            correct = d - c;
//            System.out.println(correct);
//        }
//    }
//}
