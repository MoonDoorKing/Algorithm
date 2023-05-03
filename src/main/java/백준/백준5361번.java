package 백준;

import java.util.Scanner;

public class 백준5361번 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] f = new double[5];

        f[0] = 350.34;
        f[1] = 230.90;
        f[2] = 190.55;
        f[3] = 125.30;
        f[4] = 180.90;


        int q = in.nextInt();

        for(int i=0; i<q; i++) {
            double result = 0.0;
            for(int n=0; n<5; n++) {
                double o = in.nextDouble();
                result += f[n] * o;
            }
            System.out.println("$"+String.format("%.2f",result));
        }
    }
}
