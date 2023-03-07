package 프로그래머스;

public class 진료순서정하기 {
    class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];
            for(int i=0; i<emergency.length; i++){
                answer[i]++;
                for(int j=0; j<emergency.length; j++){
                    if(emergency[i]<emergency[j])
                        answer[i]++;
                }
            }
            return answer;
        }
    }
}
