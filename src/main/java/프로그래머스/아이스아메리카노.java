package 프로그래머스;

public class 아이스아메리카노 {
    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];

            int ice = 5500;

            answer[0] = money / ice;
            answer[1] = money % ice;


            return answer;
        }
    }
}
