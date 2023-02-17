package 프로그래머스;

import java.util.ArrayList;

public class 소인수분해 {
    class Solution {
        public ArrayList<Integer> solution(int n) {
            ArrayList<Integer> answer = new ArrayList<>();
            for(int i = 2; i <= n; i++){
                while(n%i == 0){
                    if(!answer.contains(i))
                        answer.add(i);
                    n /= i;
                }
            }
            return answer;
        }
    }
}
