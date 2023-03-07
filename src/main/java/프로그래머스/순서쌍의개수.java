package 프로그래머스;

import java.util.ArrayList;

public class 순서쌍의개수 {
    class Solution {
        public int solution(int n) {
            int answer = 1;

            for(int i=2; i<=n; i++) {
                if(n%i ==0) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
