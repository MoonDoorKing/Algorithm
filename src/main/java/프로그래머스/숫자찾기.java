package 프로그래머스;

public class 숫자찾기 {
    class Solution {
        public int solution(int num, int k) {
            int answer = 0;
            String a = String.valueOf(num);
            String b = String.valueOf(k);

            answer = a.indexOf(b);

            return answer < 0 ? -1 : answer + 1;
        }
    }
}
