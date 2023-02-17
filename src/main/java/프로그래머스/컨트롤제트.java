package 프로그래머스;

import java.util.Stack;

public class 컨트롤제트 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();

            for(String w : s.split(" ")) {
                if(w.equals("Z")) {
                    stack.pop();
                } else {
                    stack.push(Integer.parseInt(w));
                }
            }
            for(int i : stack) {
                answer += i;
            }

            return answer;
        }
    }
}
