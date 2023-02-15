package 프로그래머스;

import java.util.Arrays;

public class 삼각형의완성조건투 {
    class Solution {
        public int solution(int[] sides) {
            Arrays.sort(sides);
            return sides[0] + sides[1] - (sides[1] - sides[0]) -1;
        }
    }
}
