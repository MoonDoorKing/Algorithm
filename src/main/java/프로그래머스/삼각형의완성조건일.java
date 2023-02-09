package 프로그래머스;

import java.util.Arrays;

public class 삼각형의완성조건일 {
    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            Arrays.sort(sides);
            if(sides[0] + sides[1] <= sides[2]) {
                answer = 2;
            } else {
                answer = 1;
            }

            return answer;
        }
    }
}
