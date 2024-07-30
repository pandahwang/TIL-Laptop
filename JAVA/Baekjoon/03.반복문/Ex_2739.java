import java.util.Scanner;

public class Ex_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;

        for(;i<10;i++){
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}
