package 프로그래머스;

public class 이진수더하기 {
    class Solution {
        public String solution(String bin1, String bin2) {
            String answer = "";

            answer = Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2));

            return answer;
        }
    }
}
