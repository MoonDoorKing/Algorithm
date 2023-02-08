package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 인덱스바꾸기 {
    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";
            String[] a = my_string.split("");
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(a));

            Collections.swap(arrayList, num1, num2);

            for(int i=0; i<arrayList.size(); i++) {
                answer += arrayList.get(i);
            }

            return answer;
        }
    }
}
