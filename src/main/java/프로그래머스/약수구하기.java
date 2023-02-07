package 프로그래머스;

import java.util.ArrayList;

public class 약수구하기 {
   class Solution {
        public ArrayList<Integer> solution(int n) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i=1; i<=n; i++) {
                if(n % i == 0) {
                    arrayList.add(i);
                }
            }
            return arrayList;
        }
    }
}
