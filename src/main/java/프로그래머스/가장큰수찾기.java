package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 가장큰수찾기 {
    class Solution {
        public ArrayList<Integer> solution(int[] array) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<Integer> arrayList1 = new ArrayList<>();

            for(int i : array) {
                arrayList1.add(i);
            }
            Collections.sort(arrayList1,Collections.reverseOrder());
            arrayList.add(arrayList1.get(0));

            for(int d = 0; d < array.length; d++) {
                if(arrayList.get(0) == array[d]) {
                    arrayList.add(d);
                }
            }

            return arrayList;
        }
    }
}
