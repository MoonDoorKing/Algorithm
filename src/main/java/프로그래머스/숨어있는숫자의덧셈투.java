package 프로그래머스;

public class 숨어있는숫자의덧셈투 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

            for(String s : str){
                if(!s.equals(""))
                    answer += Integer.valueOf(s);
            }

            return answer;
        }
    }
}
