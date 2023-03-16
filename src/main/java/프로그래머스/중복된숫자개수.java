package 프로그래머스;

public class 중복된숫자개수 {
    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for(int i : array) {
                if(i==n) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
