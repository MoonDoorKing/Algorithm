package 프로그래머스;

public class 편지 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("happy birthday!"));
    }
    static class Solution {
        public int solution(String message) {
            String[] a = message.split("");
            return  a.length * 2;
        }
    }
}
