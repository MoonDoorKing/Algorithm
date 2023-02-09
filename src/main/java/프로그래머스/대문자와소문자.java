package 프로그래머스;

public class 대문자와소문자 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            char[] c = my_string.toCharArray();

            for(int i=0; i < c.length; i++) {
                if(Character.isUpperCase(c[i])) {
                    answer += Character.toLowerCase(c[i]);
                } else {
                    answer += Character.toUpperCase(c[i]);
                }
            }
            return answer;
        }
    }
}
