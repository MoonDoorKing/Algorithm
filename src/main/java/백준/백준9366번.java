package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class 백준9366번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[3];

        for(int i=1; i<=n; i++) {
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();

            Arrays.sort(arr);

            if (arr[0] + arr[1] <= arr[2]) {
                System.out.println("Case #" + i + ": invalid!");
            } else if(arr[0]==arr[1] && arr[0]==arr[2]) {
                System.out.println("Case #" +i+": equilateral");
            } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0]==arr[2]) {
                System.out.println("Case #" +i+": isosceles");
            } else {
                System.out.println("Case #" +i+": scalene");
            }
        }
    }
}
