package 프로그래머스;

public class 주사위의개수 {
    class Solution {
        public int solution(int[] box, int n) {
            int answer = 0;
            int[] result = new int[3];

            for(int i=0; i<3; i++) {
                result[i] = box[i]/n;
            }

            return result[0] * result[1] * result[2];
        }
    }
}
