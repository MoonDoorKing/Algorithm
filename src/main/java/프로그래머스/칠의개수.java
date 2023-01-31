package 프로그래머스;

import java.util.Arrays;

public class 칠의개수 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;

            String a = Arrays.toString(array);

            for (int i = 0; i < a.length(); i++) {
                if ('7' == a.charAt(i)) answer++;
            }
            return answer;
        }
    }
}

