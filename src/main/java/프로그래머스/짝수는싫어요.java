package 프로그래머스;

public class 짝수는싫어요 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        for (int i = 1; i < n; i++) {
            if(n%i!=0) {
                answer[i] = i;
            }
        }
        return answer;
    }
}
