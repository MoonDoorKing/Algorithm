package 프로그래머스;

public class 구슬을나누는경우의수 {
    class Solution {
        public long solution(int balls, int share) {
            long answer = 1L;
            int cnt = 1;

            while(cnt <= share) {
                answer *= balls--;
                answer /= cnt++;
            }

            return answer;
        }
    }
}
