package 프로그래머스;

public class 치킨쿠폰 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1999));
    }

    static class Solution {
        public int solution(int chicken) {
            int coupon = chicken;
            int service = 0;
            while (coupon >= 10) {
                service += coupon / 10;
                coupon = coupon % 10 + coupon / 10;
            }

            return service;
        }
    }
}
