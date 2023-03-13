package 프로그래머스;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    public class Solution {
        public int[] solution(int[] arr) {
            int[] answer;
            int count = 1;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] != arr[i])
                    count++;
            }
            answer = new int[count];

            count = 1;

            answer[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] != arr[i]) {
                    answer[count] = arr[i];
                    count++;
                }
            }


            return answer;
        }
    }
}
