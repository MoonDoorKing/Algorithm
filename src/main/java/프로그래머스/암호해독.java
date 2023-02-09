package 프로그래머스;

public class 암호해독 {
    class Solution {
        public String solution(String cipher, int code) {
            StringBuilder answer = new StringBuilder();

            for (int i = code; i <= cipher.length(); i = i + code) {
                answer.append(cipher.charAt(i - 1));
            }

            return answer.toString();
        }
    }
}
