import java.util.Scanner;

public class Ex_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int endH = A;
        int endM = B + C;

        for(;endM>59;){
            endM -= 60;
            endH += 1;
        }
        for(;endH>23;){
            endH = endH - 24;
        }

        System.out.printf("%d %d", endH, endM);
    }    
}

// 소요시간이 1시간 이상일 경우에도 생각해야함.
// 조건문이 아닌 반복문을 사용해야 함.