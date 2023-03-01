package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2985번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");

        if(Integer.parseInt(a[0]) + Integer.parseInt(a[1]) == Integer.parseInt(a[2])) {
            System.out.println(a[0]+"+"+a[1]+"="+a[2]);
        }
        else if(Integer.parseInt(a[0]) - Integer.parseInt(a[1]) == Integer.parseInt(a[2])) {
            System.out.println(a[0]+"-"+a[1]+"="+a[2]);
        }
        else if(Integer.parseInt(a[0]) / Integer.parseInt(a[1]) == Integer.parseInt(a[2])) {
            System.out.println(a[0]+"/"+a[1]+"="+a[2]);
        }
        else if(Integer.parseInt(a[0]) * Integer.parseInt(a[1]) == Integer.parseInt(a[2])) {
            System.out.println(a[0]+"*"+a[1]+"="+a[2]);
        }
        else if(Integer.parseInt(a[0]) == Integer.parseInt(a[1]) + Integer.parseInt(a[2])) {
            System.out.println(a[0]+"="+a[1]+"+"+a[2]);
        }
        else if(Integer.parseInt(a[0]) == Integer.parseInt(a[1]) - Integer.parseInt(a[2])) {
            System.out.println(a[0]+"="+a[1]+"-"+a[2]);
        }
        else if(Integer.parseInt(a[0]) == Integer.parseInt(a[1]) / Integer.parseInt(a[2])) {
            System.out.println(a[0]+"="+a[1]+"/"+a[2]);
        }
        else if(Integer.parseInt(a[0]) == Integer.parseInt(a[1]) * Integer.parseInt(a[2])) {
            System.out.println(a[0]+"="+a[1]+"*"+a[2]);
        }
    }
}
