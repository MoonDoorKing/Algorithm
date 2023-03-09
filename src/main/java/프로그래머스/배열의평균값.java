package 프로그래머스;

public class 배열의평균값 {
    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;

            for(int i : numbers) {
                answer += i;
            }

            return answer/numbers.length;
        }
    }
}
