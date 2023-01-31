package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class 문자열정렬하기투 {
    class Solution {
        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();
            ArrayList arrayList = new ArrayList(List.of(my_string.split("")));

            arrayList.sort(String.CASE_INSENSITIVE_ORDER);

            for(int i=0;i<arrayList.size(); i++) {
                answer.append(arrayList.get(i));
            }

            return answer.toString().toLowerCase();
        }
    }
}


// import java.util.*;
//class Solution {
//    public String solution(String my_string) {
//        char[] c = my_string.toLowerCase().toCharArray();
//        Arrays.sort(c);
//        return new String(c);
//    }
//}
