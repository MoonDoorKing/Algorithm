package 프로그래머스;

public class 피자나눠먹기일 {
    class Solution {
        public int solution(int n) {
            int answer = 1;
            while(true) {
                if(answer * 7 >= n) {
                    break;
                }
                answer++;
            }
            return answer;
        }
    }
}
