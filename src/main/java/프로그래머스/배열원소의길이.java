package 프로그래머스;

public class 배열원소의길이 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            for(int i=0; i<strlist.length; i++) {
                answer[i] = strlist[i].length();
            }
            return answer;
        }
    }
}
