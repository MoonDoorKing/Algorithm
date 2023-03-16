package 프로그래머스;

public class 두수의나눗셈 {
    class Solution {
        public int solution(int num1, int num2) {
            double a = (double)num1 / num2;

            return (int) (a * 1000);
        }
    }
}
