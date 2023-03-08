package 프로그래머스;

public class 문자열뒤집기 {
    class Solution {
        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();

            for(int i=my_string.length()-1; i>=0 ; i--) {
                answer.append(my_string.charAt(i));
            }
            return answer.toString();
        }
    }
}

//class Solution {
//    public String solution(String my_string) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(my_string);
//        sb.reverse();
//
//        return sb.toString();
//    }
//}