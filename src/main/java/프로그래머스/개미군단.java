package 프로그래머스;

public class 개미군단 {
    class Solution {
        public int solution(int hp) {
            int answer = 0;
            int result = hp;
            int a = 5;
            int b = 3;
            int c = 1;

            if(result >= a) {
                answer += result/a;
                result = result%a;
            }
            if(result >= b) {
                answer += result/b;
                result = result%b;
            }
            if(result >= c) {
                answer += result/c;
            }


            return answer;
        }
    }
}
