package 프로그래머스;

public class 문자반복출력하기 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuilder answer = new StringBuilder();
            String[] a = my_string.split("");

            for(int i=0; i<a.length; i++) {
                answer.append(a[i].repeat(n));
            }
            return answer.toString();
        }
    }
}
