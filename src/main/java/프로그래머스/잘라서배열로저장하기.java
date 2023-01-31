package 프로그래머스;

public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        int result = (my_str.length() + n - 1) / n; // my_str 을 n 으로 나눠서 배열의 크기를 구함.
        String[] answer = new String[result];

        for (int i = 0; i < result; i++) { // 배열의 크기만큼 for 문
            int start = n * i; // n 이 3 이라면 0,3,6
            int end = Math.min(start + n, my_str.length()); // start + n 이 my_str 의 길이보다 크거나 같으면 my_str의 길이 만큼 그렇지 않으면 start + n의 값을
            //int end = start + n >= my_str.length() ? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}
