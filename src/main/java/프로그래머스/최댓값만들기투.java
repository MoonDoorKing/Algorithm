package 프로그래머스;

import java.util.Arrays;

public class 최댓값만들기투 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = numbers.length;
            Arrays.sort(numbers);
            return Math.max(numbers[0] * numbers[1], numbers[answer - 2] * numbers[answer - 1]);
        }
    }
}
