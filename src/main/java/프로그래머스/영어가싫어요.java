package 프로그래머스;

public class 영어가싫어요 {
  class Solution {
        public long solution(String numbers) {
            String a = numbers
                    .replace("zero", "0")
                    .replace("one", "1")
                    .replace("two", "2")
                    .replace("three", "3")
                    .replace("four", "4")
                    .replace("five", "5")
                    .replace("six", "6")
                    .replace("seven", "7")
                    .replace("eight", "8")
                    .replace("nine", "9");

            long answer = Long.parseLong(a);
            return answer;
        }
    }
}
