package 프로그래머스;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}
