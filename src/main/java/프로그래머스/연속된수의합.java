package 프로그래머스;

public class 연속된수의합 {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num]; // num 의 크기 만큼 배열 생성

            int a = total / num; // total / num  ex) 12/3 = 4
            int b = total % num == 0 ? num / 2 : num / 2 - 1;
            // total 과 num 을 나눴을때 나머지가 0이면 num/2 하고
            // 아니라면 num / 2 -1
            // ex) 3/2 = 1 : 3/2 -1 = 0
            int c = a - b; // 3

            for(int i = 0; i < num; i++) {
                answer[i] = c + i; // num 개의 연속된 숫자를 더하기 때문에 answer[i] = 3 + 0부터 2까지 배열에 넣어줌

            }
            return answer;
        }
    }
}
