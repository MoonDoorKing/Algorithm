package 프로그래머스;

public class 특이한정렬 {
    class Solution {
        public int[] solution(int[] numlist, int n) {
            int temp = 0;

            for (int i = 0; i < numlist.length; i++) {
                for (int j = i; j < numlist.length; j++) {
                    if (Math.abs(numlist[i] - n) > Math.abs(numlist[j] - n)) {
                        temp = numlist[j];
                        numlist[j] = numlist[i];
                        numlist[i] = temp;
                    }
                    if (Math.abs(numlist[i] - n) == Math.abs(numlist[j] - n) && numlist[i] < numlist[j]) {
                        temp = numlist[j];
                        numlist[j] = numlist[i];
                        numlist[i] = temp;
                    }
                }
            }
            return numlist;
        }
    }
}
