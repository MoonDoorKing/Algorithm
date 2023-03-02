package 프로그래머스;


import java.util.Arrays;

public class 최댓값만들기일 {
    class Solution {
        public int solution(int[] numbers) {

            Arrays.sort(numbers);

            return numbers[numbers.length-1] * numbers[numbers.length-2];
        }
    }
}
