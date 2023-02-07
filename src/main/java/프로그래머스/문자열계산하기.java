package 프로그래머스;

public class 문자열계산하기 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String[] ans = my_string.trim().split(" ");
            answer = Integer.parseInt(ans[0]);
            for (int i = 1; i < ans.length - 1; i++) {
                if (ans[i].equals("+")) {
                    answer += Integer.parseInt(ans[i + 1]);
                } else if (ans[i].equals("-")) {
                    answer -= Integer.parseInt(ans[i + 1]);
                }
            }
            return answer;
        }
    }
}

