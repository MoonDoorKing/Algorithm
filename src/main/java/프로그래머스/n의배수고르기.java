package 프로그래머스;

import java.util.ArrayList;

public class n의배수고르기 {
   class Solution {
        public ArrayList solution(int n, int[] numlist) {
            ArrayList<Integer> answer = new ArrayList<>();

            for (int i : numlist) {
                if (i % n == 0) {
                    answer.add(i);
                }
            }
            return answer;
        }
    }
}
