package 프로그래머스;

public class 외계행성의나이 {
    class Solution {
        public String solution(int age) {
            StringBuilder answer = new StringBuilder();

            String[] a = String.valueOf(age).split("");

            for(int i=0; i<a.length; i++) {
                answer.append(a[i].replaceAll("0", "a")
                        .replaceAll("1", "b")
                        .replaceAll("2", "c")
                        .replaceAll("3", "d")
                        .replaceAll("4", "e")
                        .replaceAll("5", "f")
                        .replaceAll("6", "g")
                        .replaceAll("7", "h")
                        .replaceAll("8", "i")
                        .replaceAll("9", "j"));
            }


            return answer.toString();
        }
    }
}
