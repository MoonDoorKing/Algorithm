package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2712번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());

            double b = Double.parseDouble(st.nextToken());

            String tk = st.nextToken();

            if("kg".equals(tk)) {
                System.out.printf("%.04f lb\n", b * 2.2046);
            } else if ("g".equals(tk)) {
                System.out.printf("%.04f l\n", b * 3.7854);
            }
            if("l".equals(tk)) {
                System.out.printf("%.04f g\n", b * 0.2642);
            } else if ("lb".equals(tk)) {
                System.out.printf("%.04f kg\n", b * 0.4536);
            }
        }
    }
}
