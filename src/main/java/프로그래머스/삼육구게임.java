package 프로그래머스;

public class 삼육구게임 {

    class Solution {
        public int solution(int order) {
            int answer = 0;

            String a = String.valueOf(order);
            String[] b = a.split("");

            for(int i=0; i<b.length; i++) {
                if(Integer.parseInt(b[i]) == 0) {
                } else if (Integer.parseInt(b[i]) % 3 == 0) {
                    answer++;
                }
            }
//            String str = "" + order;
//            for(int i=0;i<str.length();i++){
//                if((int)str.charAt(i)%3==0 && str.charAt(i)!='0'){
//                    answer++;
//                }
//            }



            return answer;
        }
    }
}
