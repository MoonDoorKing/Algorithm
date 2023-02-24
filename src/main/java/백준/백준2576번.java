package 백준;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준2576번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int cnt = 0;

        for(int i=0; i<7; i++) {
            arrayList.add(in.nextInt());
        }

        for(int d : arrayList) {
            if(d % 2 == 1) {
                cnt += d;
                arrayList2.add(d);
            }
        }
        arrayList2.sort(null);

        if(cnt == 0) {
            System.out.println("-1");
        } else {
            System.out.println(cnt);
            System.out.println(arrayList2.get(0));
        }
    }
}
