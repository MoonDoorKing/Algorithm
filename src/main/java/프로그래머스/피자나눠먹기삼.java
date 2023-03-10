package 프로그래머스;

public class 피자나눠먹기삼 {
    class Solution {
        public int solution(int slice, int n) {
            int answer = 0;
            int cnt = 0;
            for(int i=1; i<=n; i++) {
                cnt = slice * i;
                if(cnt >= n) {
                    answer = i;
                    break;
                }
            }

            return answer;
        }
    }
}
