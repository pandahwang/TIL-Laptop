import java.util.Scanner;
import java.util.Arrays;

public class Ex_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dice = new int[3];
        for(int i = 0; i<3; i++){
            dice[i]= sc.nextInt();
        }
        int prize = 0;

        Arrays.sort(dice);

        if (dice[0] == dice[1] && dice[1] == dice[2]){
            prize = 10000 + (dice[1] * 1000);
        }
        else if (dice[0] == dice[1] || dice [1] == dice[2]){
            prize = 1000 + (dice[1] * 100);
        }
        else {
            prize = dice[2] * 100;
        }
        System.out.println(prize);
    }
}
// 입력받은 값들을 정렬해야 처리하기 편하기 때문에
// 배열을 생성하여 값을 넣고 정렬시킨 뒤에 처리함
// 정렬하지 않으면 dice[0] == dice[2]의 경우를 처리하기 까다로움
