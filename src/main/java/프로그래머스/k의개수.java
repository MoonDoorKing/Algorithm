package 프로그래머스;

public class k의개수 {
   class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;
            String a = "";
            for(int d=i; d<=j; d++) {
                a+= d;
            }
            // 전체 문자열의 길이에서 a 를 제외한 길이를 뺌
            answer = a.length() - a.replace(String.valueOf(k),"").length();
            return answer;
        }
    }
}
