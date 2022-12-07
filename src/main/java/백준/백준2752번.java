package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 백준2752번 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(a,b,c));
        Collections.sort(arrayList);

        System.out.println(arrayList.get(0).toString() + " " + arrayList.get(1).toString() + " " + arrayList.get(2).toString() );
    }
}
