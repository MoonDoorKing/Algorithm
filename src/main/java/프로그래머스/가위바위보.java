package 프로그래머스;

public class 가위바위보 {
    class Solution {
        public String solution(String rsp) {
            StringBuilder answer = new StringBuilder();

            String[] a = rsp.split("");

            for (String s : a) {
                if ("0".equals(s)) {
                    answer.append("5");
                } else if ("2".equals(s)) {
                    answer.append("0");
                } else if ("5".equals(s)) {
                    answer.append("2");
                }

            }
            return answer.toString();
        }
    }
}
