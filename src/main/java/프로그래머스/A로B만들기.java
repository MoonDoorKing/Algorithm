package 프로그래머스;

import java.util.Arrays;

public class A로B만들기 {
    class Solution {
        public int solution(String before, String after) {
            int answer = 0;
            String[] a = before.split("");
            String[] b = after.split("");

            int cnt = 0;
            Arrays.sort(a);
            Arrays.sort(b);

            for(int i=0; i<a.length; i++) {
                if(a[i].equals(b[i])) {
                    cnt++;
                }
            }
            if(cnt == a.length) {
                answer = 1;
            }
            return answer;
        }
    }
}
