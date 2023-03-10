package 프로그래머스;

public class 피자나눠먹기이 {
    class Solution {
        public int solution(int n) {
            int answer = 1;

            while (true) {
                if (6 * answer % n == 0)
                    break;
                answer++;
            }

            return answer;
        }
    }
}
