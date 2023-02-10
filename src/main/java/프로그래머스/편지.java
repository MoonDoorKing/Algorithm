package 프로그래머스;

public class 편지 {
  class Solution {
        public int solution(String message) {
            String[] a = message.split("");
            return  a.length * 2;
        }
    }
}
