package 백준;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준2501번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arrayList.add(i);
            }
        }
        if(arrayList.size() < b) {
            System.out.println(0);
        } else {
            System.out.println(arrayList.get(b-1));
        }
    }
}
