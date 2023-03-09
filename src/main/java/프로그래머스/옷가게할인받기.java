package 프로그래머스;

public class 옷가게할인받기 {
    class Solution {
        public int solution(int price) {
            int answer = price;

            if(price >= 100000 && price <= 299999) {
                answer = (int) (price - (price * 0.05));
            } else if (price >= 300000 && price <= 499999) {
                answer = (int) (price - (price * 0.1));
            } else if (price >= 500000) {
                answer = (int) (price - (price * 0.2));
            }
            return answer;
        }
    }
}
