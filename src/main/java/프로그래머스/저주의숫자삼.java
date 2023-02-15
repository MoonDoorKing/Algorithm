package 프로그래머스;

public class 저주의숫자삼 {
    class Solution {
        public int solution(int n) {
            String str;
            for (int i = 1; i <= n; i++){
                str = ""+i;
                if(str.contains("3") || i%3 == 0)
                    n++;
            }
            return n;
        }
    }
}
