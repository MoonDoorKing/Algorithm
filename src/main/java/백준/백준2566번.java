package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 백준2566번 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                numbers[i][j] = sc.nextInt();
                if (max < numbers[i][j])
                {
                    max = numbers[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((x + 1) + " " + (y + 1));
    }
}
