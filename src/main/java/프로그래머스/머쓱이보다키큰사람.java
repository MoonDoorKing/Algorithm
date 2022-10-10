package 프로그래머스;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array) {
            if(i > height)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {100,150,140,124,190};
        int height = 160;
        머쓱이보다키큰사람 a = new 머쓱이보다키큰사람();

        System.out.println(a.solution(array,height));
    }
}
