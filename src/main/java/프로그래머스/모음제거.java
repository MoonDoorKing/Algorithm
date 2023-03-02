package 프로그래머스;

public class 모음제거 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            answer = my_string.replaceAll("i", "")
                    .replaceAll("a","")
                    .replaceAll("e","")
                    .replaceAll("o","")
                    .replaceAll("u","");

            // answer = my_string.replaceAll("[aeiou]", "");

            return answer;
        }
    }
}
