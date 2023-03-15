package 프로그래머스;

import java.util.Arrays;

public class 중앙값구하기 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;
            Arrays.sort(array);

            answer = array[array.length/2];

            return answer;
        }
    }
}
