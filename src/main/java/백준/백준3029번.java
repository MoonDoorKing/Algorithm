package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준3029번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(":");
        String[] b = br.readLine().split(":");

        int[] c = new int[3];
        //int형으로 형변환 하면서 시간의 차를 시 분 초 기준으로 저장한다.
        for(int i = 0; i < 3; i++) {
            c[i] = Integer.parseInt(b[i]) - Integer.parseInt(a[i]);
        }

        if(Arrays.equals(a, b)) {
            System.out.println("24:00:00");
        }else {
            if(c[2] < 0) {
                c[2] += 60;
                c[1]--;
            }
            if(c[1] < 0) {
                c[1] += 60;
                c[0]--;
            }
            if(c[0] < 0) {
                c[0] += 24;
            }
            //00:00:00방식으로 출력하기 위한 포맷
            System.out.format("%02d:%02d:%02d", c[0], c[1], c[2]);
        }

    }
}

//    각 시간을 split을 이용해 string 배열에 저장한다. 연산을 위해 int로 변환해야 하기에 int 배열에 저장하는데 시간의 차를 구해야하니 int 배열에 저장하면서 두 시간을 서로 빼서 저장한다.
//
//        다음으로 넘어가기전에 if문으로 두 시간이 같다면 24:00:00 출력하는 조건문을 만든다. 만들지 않는다면 00:00:00이 출력될 것이기 때문이다.
//
//        저 조건을 이어서 아닐경우에 다음 내용을 넣는다.
//
//        시 분 초로 나뉘어 지는데 초부터 시작해서 음수가 나오게 되면 초는 60 분도 60 시는 24를 각각 조건에 맞춰 넣어준다. 여기서 주의할 건 초와 분은 음수이면 다음 단위인 초가 음수이면 분에서 -1해주고 분이 음수이면 시에서 -1 해준다.
//
//        출력할때는 00:00:00 식으로 출력되어야하기 때문에 System.out.format 또는 System.out.printfd를 사용한다.
