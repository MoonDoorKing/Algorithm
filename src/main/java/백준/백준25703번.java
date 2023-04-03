package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준25703번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        sb.append("int a;").append("\n");
        sb.append("int *ptr = &a;").append("\n");

        for (int i = 2; i <= a; i++) {
            sb.append("int ");
            for (int j = 0; j < i; j++) sb.append('*');
            sb.append("ptr").append(i).append(" = &ptr").append(i - 1 == 1 ? "" : i - 1).append(';').append("\n");
        }
        System.out.println(sb);
    }
}
