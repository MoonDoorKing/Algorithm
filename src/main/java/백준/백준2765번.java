package 백준;

import java.util.Scanner;

public class 백준2765번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 1;

        while(true) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

            if(b==0) break;

            c = (c/60) / 60;
            double distance = ((((a * 3.1415927) * b) / 12) / 5280);
            double mph = (distance / c);

            System.out.println("Trip #"+cnt+": "+String.format("%.2f",distance)+" "+String.format("%.2f", mph));
            cnt++;

        }
    }
}
