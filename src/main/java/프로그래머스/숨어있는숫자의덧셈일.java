package 프로그래머스;

public class 숨어있는숫자의덧셈일 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            String a = my_string.replaceAll("[^0-9]","");

            String[] b = a.split("");

            for(int i=0; i<b.length; i++) {
                answer += Integer.parseInt(b[i]);
            }

            return answer;
        }
    }
}
