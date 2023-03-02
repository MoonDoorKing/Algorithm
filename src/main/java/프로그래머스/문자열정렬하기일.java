package 프로그래머스;

import java.util.Arrays;

public class 문자열정렬하기일 {
    class Solution {
        public int[] solution(String my_string) {
            String[] b = my_string.replaceAll("[^0-9]","").split("");

            int[] answer = new int[b.length];

            for(int i=0; i<answer.length; i++) {
                answer[i] = Integer.parseInt(b[i]);
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}
