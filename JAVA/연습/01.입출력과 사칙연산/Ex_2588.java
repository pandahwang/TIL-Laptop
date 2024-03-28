import java.util.Scanner;
import java.lang.reflect.Array;

public class Ex_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A*(B%10));
        System.out.println(A*(B));
        System.out.println(A*(B));
        System.out.println(A*B);

    }
}
