package 프로그래머스;

public class 제곱수판별하기 {
    static class Solution {
        public int solution(int n) {
            int answer = 2;
            for (int i = 0; i < n; i++) {
                if (n == i * i) {
                    answer = 1;
                }
            }
            return answer;
        }
    }
}
