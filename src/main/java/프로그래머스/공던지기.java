package 프로그래머스;

public class 공던지기 {
    class Solution {
        public int solution(int[] numbers, int k) {
            return numbers[2 * (k-1) % numbers.length];
        }
    }
}
