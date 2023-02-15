package 프로그래머스;

public class 유한소수판별하기 {
    class Solution {
        public int solution(int a, int b) {
            while (b % 2 == 0)
                b /= 2;
            while (b % 5 == 0)
                b /= 5;
            int ans = 2;
            if (a % b == 0)
                ans = 1;
            return ans;
        }
    }
}
