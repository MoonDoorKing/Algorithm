package 프로그래머스;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        long k = (long) Math.sqrt(n);

        return answer = (n==Math.pow(k,2)) ? (long) Math.pow(k+1,2) : -1;
    }
}
