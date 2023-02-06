package 프로그래머스;

public class OX퀴즈 {
   class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            for(int i=0; i< quiz.length; i++) {
                String[] a = quiz[i].trim().split(" ");
                int X = Integer.parseInt(a[0]);
                int Y = Integer.parseInt(a[2]);
                int Z = Integer.parseInt(a[4]);
                int cal = 0;
                if(a[1].equals("-")){
                    cal = X - Y;
                }else{
                    cal = X + Y;
                }

                answer[i] = Z == cal ? "O" : "X";
            }

            return answer;
        }
    }
}
