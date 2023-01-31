package 프로그래머스;

public class 다음에올숫자 {
    class test {
        public int solution(int[] common) {
            int answer = 0;
            if(common[2]-common[1] == common[1]-common[0]) // 배열의 3번 - 2번과 2번 - 1번이 같으면
                return common[common.length-1] + common[2] - common[1]; // 배열의 마지막 요소에 3번 - 2번 값을 더 해준다.
            else
                return common[common.length-1] * (common[2]/common[1]); // 같지 않다면 배열의 마지막 요소에 3번 나누기 2번을 곱해준다.
        }
    }
}
