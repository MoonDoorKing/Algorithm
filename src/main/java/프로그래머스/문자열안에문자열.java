package 프로그래머스;

public class 문자열안에문자열 {
    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;
            int a = str1.indexOf(str2);

            if(a == -1)
                answer = 2;
            else
                answer = 1;


            return answer;
        }
    }
}
