package 프로그래머스;

public class 최빈값구하기 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;

            int index_d = 1000; // index_d값 초기 설정(1000)

            int[] ary = new int[2001]; // 크기가 2001인 배열 생성

            for(int i = 0; i < array.length; i++){ // i시작 0부터 array 미만일때까지 하나씩 증가
                ary[array[i] + index_d]++; // arr[]은 최소 array[0] + 1000 부터 하나씩 증가
            }

            int max = 0; // 최대값 초기 설정
            int max_index = 0; // 최대값 인덱스 초기 설정

            for(int i = 0; i < ary.length; i++){ // i시작 0부터 ary 미만일때까지 하나씩 증가
                if(ary[i] > max){ // ary[i]가 max 보다 크면
                    max = ary[i]; // max는 ary배열 값
                    max_index = i-index_d; // max_index는 i-index_d(1000)
                }
            }
            int count = 0; // count값 초기 설정
            for(int i = 0; i < ary.length; i++){
                if(ary[i]==max) count++; // ary[i]가 max와 같으면 count 하나씩 증가
            }
            if(count > 1) return -1; // count가 1보다 크면 return 값 -1
            answer = max_index; // answer값은 max_index

            return answer; // return값은 answer
        }
    }
}
