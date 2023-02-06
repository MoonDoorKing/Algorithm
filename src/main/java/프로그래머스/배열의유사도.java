package 프로그래머스;

public class 배열의유사도 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s1 = {"a","b","c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution.solution(s1,s2));
    }
    static class Solution {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;

            for(int i=0; i<s1.length; i++) {
                for(int d=0; d<s2.length; d++) {
                    if(s1[i].equals(s2[d])) {
                        answer++;
                    }
                }
            }
            return answer;
        }
    }
}
