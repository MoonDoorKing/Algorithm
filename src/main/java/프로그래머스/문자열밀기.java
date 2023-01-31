package 프로그래머스;

public class 문자열밀기 {
    class Solution {
        public int solution(String A, String B) {
            return (B + B).indexOf(A); // indexOf 로 문자의 위치를 찾는다.
        }
    }
}
